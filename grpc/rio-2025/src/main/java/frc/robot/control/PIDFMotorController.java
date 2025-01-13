package frc.robot.control;

import java.util.function.DoubleSupplier;

import CLIPPY.control.SystemStateOuterClass.SystemState;
import CLIPPY.control.SystemStateOuterClass.SystemState.Measurement;
import CLIPPY.control.ControlGainsOuterClass.ZNControlRule;
import edu.wpi.first.math.controller.ElevatorFeedforward;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import frc.robot.constants.Settings;
import frc.robot.flow.ILooper;
import frc.robot.flow.Registry;
import frc.robot.util.Time;

public class PIDFMotorController implements ISystem, ILooper {

    private String id;

    private PIDController pid;
    private ElevatorFeedforward ff;
    private MotorController m;
    private DoubleSupplier feedback;

    private double velocity = 0;
    private double voltage = 0;
    private Double bypassVoltage = null;

    public PIDFMotorController(String id, MotorController m, DoubleSupplier feedback) {
        Registry.getInstance().systems.put(id, this);
        Registry.getInstance().loopers.add(this);
        this.id = id;
        this.pid = new PIDController(0, 0, 0, Settings.MAIN_LOOP_TIME);
        this.ff = new ElevatorFeedforward(0, 0, 0, 0);
        this.m = m;
        this.feedback = feedback;
    }

    @Override
    public PIDFMotorController setReference(double r) {
        setVelocity(r);
        return this;
    }

    @Override
    public PIDFMotorController setBypassInput(Double u) {
        bypassVoltage = u;
        return this;
    }

    @Override
    public PIDFMotorController setP(double kP) {
        pid.setP(kP);
        return this;
    }

    @Override
    public PIDFMotorController setI(double kI) {
        pid.setI(kI);
        return this;
    }

    @Override
    public PIDFMotorController setD(double kD) {
        pid.setD(kD);
        return this;
    }

    @Override
    public PIDFMotorController setF_static(double kF_static) {
        ff = new ElevatorFeedforward(kF_static, ff.getKg(), ff.getKv(), ff.getKa());
        return this;
    }

    @Override
    public PIDFMotorController setF_linear(double kF_linear) {
        ff = new ElevatorFeedforward(ff.getKs(), ff.getKg(), kF_linear, ff.getKa());
        return this;
    }

    @Override
    public PIDFMotorController setF_linear_per_time(double kF_lpt) {
        ff = new ElevatorFeedforward(ff.getKs(), ff.getKg(), ff.getKv(), kF_lpt);
        return this;
    }

    @Override
    public PIDFMotorController setF_constant(double kF_constant) {
        ff = new ElevatorFeedforward(ff.getKs(), kF_constant, ff.getKv(), ff.getKa());
        return this;
    }

    @Override
    public PIDFMotorController zieglify(double Ku, double Tu, ZNControlRule style) {
        double kKp = 0, kTi = 0, kTd = 0;
        switch (style) {
            case P:
                kKp = 1/2d;
                kTi = 0;
                kTd = 0;
                break;
            case PI:
                kKp = 9/20d;
                kTi = 5/6d;
                kTd = 0;
                break;
            case PD:
                kKp = 4/5d;
                kTi = 0;
                kTd = 1/8d;
                break;
            case PID:
                kKp = 3/5d;
                kTi = 1/2d;
                kTd = 1/8d;
                break;
            case PESSEN:
                kKp = 7/10d;
                kTi = 2/5d;
                kTd = 3/20d;
                break;
            case MILD_OVERSHOOT:
                kKp = 1/3d;
                kTi = 1/2d;
                kTd = 1/3d;
                break;
            case NO_OVERSHOOT:
                kKp = 1/5d;
                kTi = 1/2d;
                kTd = 1/3d;
                break;
            // Add custom rule implementations here. Add case names to ControlGains.proto
            default:
                System.err.print("[warn] Attempted to set kU = " + Ku + " and tU = " + Tu + ", but either no Ziegler-Nichols control rule was specified, or it was specified as UNSET.");
                break;
        }
        double Kp = kKp * Ku;
        double Ti = kTi * Tu;
        double Td = kTd * Tu;
        setP(Kp);
        setI(Kp / Ti);
        setD(Kp * Td);
        return this;
    }

    public PIDFMotorController setVelocity(double velocity) {
        this.velocity = velocity;
        return this;
    }

    @Override
    public ILooper init() { return this; }

    @Override
    public ILooper loop() {
        if (bypassVoltage == null)
            voltage = ff.calculate(velocity) + pid.calculate(feedback.getAsDouble(), velocity);
        else voltage = bypassVoltage;
        m.setVoltage(voltage);
        return this;
    }

    @Override
    public SystemState buildSystemState() {
        Measurement x = Measurement.newBuilder()
            .setVelocity(feedback.getAsDouble())
            .setVoltage(voltage)
        .build();
        return SystemState.newBuilder()
            .setTimestamp(Time.nowTimestamp())
            .setSystemId(id)
            .setState(x)
            .build();
    }

    @Override
    public ILooper stop() { return this; }
}
