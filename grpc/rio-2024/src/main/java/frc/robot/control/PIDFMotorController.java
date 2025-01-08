package frc.robot.control;

import java.util.function.DoubleSupplier;

import edu.wpi.first.math.controller.ElevatorFeedforward;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import frc.robot.constants.Settings;

public class PIDFMotorController implements IGenericPIDController {

    private PIDController pid;
    private ElevatorFeedforward elevator;

    public PIDFMotorController(MotorController m, DoubleSupplier feedback) {
        this.pid = new PIDController(0, 0, 0, Settings.MAIN_LOOP_TIME);
        this.elevator = new ElevatorFeedforward(0, 0, 0, 0);
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
        elevator = new ElevatorFeedforward(kF_static, elevator.kg, elevator.kv, elevator.ka);
        return this;
    }

    @Override
    public PIDFMotorController setF_linear(double kF_linear) {
        elevator = new ElevatorFeedforward(elevator.ks, elevator.kg, kF_linear, elevator.ka);
        return this;
    }

    @Override
    public PIDFMotorController setF_linear_per_time(double kF_lpt) {
        elevator = new ElevatorFeedforward(elevator.ks, elevator.kg, elevator.kv, kF_lpt);
        return this;
    }

    @Override
    public PIDFMotorController setF_constant(double kF_constant) {
        elevator = new ElevatorFeedforward(elevator.ks, kF_constant, elevator.kv, elevator.ka);
        return this;
    }

    @Override
    public PIDFMotorController zieglify(double Ku, double Tu, ZNControlRule style) {
        double kKp = 0, kTi = 0, kTd = 0;
        switch (style) {
            case P:
                kKp = 1/2f;
                kTi = 0;
                kTd = 0;
                break;
            case PI:
                kKp = 9/20f;
                kTi = 5/6f;
                kTd = 0;
                break;
            case PD:
                kKp = 4/5f;
                kTi = 0;
                kTd = 1/8f;
                break;
            case PID:
                kKp = 3/5f;
                kTi = 1/2f;
                kTd = 1/8f;
                break;
            case PESSEN:
                kKp = 7/10f;
                kTi = 2/5f;
                kTd = 3/20f;
                break;
            case MILD_OVERSHOOT:
                kKp = 1/3f;
                kTi = 1/2f;
                kTd = 1/3f;
                break;
            case NO_OVERSHOOT:
                kKp = 1/5f;
                kTi = 1/2f;
                kTd = 1/3f;
                break;
            // Add custom rule implementations here. Add the case name to IGenericPIDController
            default: break;
        }
        double Kp = kKp * Ku;
        double Ti = kTi * Tu;
        double Td = kTd * Tu;
        setP(Kp);
        setI(Kp / Ti);
        setD(Kp * Td);
        return this;
    }
}
