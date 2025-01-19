package CLIPPY.control;
import com.google.protobuf.DoubleValue;

import CLIPPY.control.ControlGainsOuterClass.ControlGains;
import CLIPPY.control.SystemStateOuterClass.SystemState;
import edu.wpi.first.math.controller.ElevatorFeedforward;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.controller.ProfiledPIDController;
import frc.robot.constants.Config;

public abstract class WippyTuner extends AbstractTuner {
    private ElevatorFeedforward ff;
    private PIDController pid;
    private ProfiledPIDController trap;

    public WippyTuner(String id, String... tags) {
        super(id, tags);
        this.ff = new ElevatorFeedforward(0, 0, 0, 0);
        this.pid = new PIDController(0, 0, 0, Config.LOOP_PERIOD);
        this.trap = new ProfiledPIDController(0, 0, 0, null, Config.LOOP_PERIOD);
    }

    @Override
    public WippyTuner setP(double kP) {
        pid.setP(kP);
        trap.setP(kP);
        return this;
    }

    @Override
    public WippyTuner setI(double kI) {
        pid.setI(kI);
        trap.setI(kI);
        return this;
    }

    @Override
    public WippyTuner setD(double kD) {
        pid.setD(kD);
        trap.setD(kD);
        return this;
    }

    @Override
    public WippyTuner setF_static(double kF_static) {
        ff = new ElevatorFeedforward(kF_static, ff.getKg(), ff.getKv(), ff.getKa());
        return this;
    }

    @Override
    public WippyTuner setF_constant(double kF_constant) {
        ff = new ElevatorFeedforward(ff.getKs(), kF_constant, ff.getKv(), ff.getKa());
        return this;
    }

    @Override
    public WippyTuner setF_linear(double kF_linear) {
        ff = new ElevatorFeedforward(ff.getKs(), ff.getKg(), kF_linear, ff.getKa());
        return this;
    }

    @Override
    public WippyTuner setF_linear_per_time(double kF_lpt) {
        ff = new ElevatorFeedforward(ff.getKs(), ff.getKg(), ff.getKv(), kF_lpt);
        return this;
    }

    @Override
    public SystemState buildSystemState() {
        SystemState out = super.buildSystemState();
        ControlGains k = ControlGains.newBuilder()
            .setKP(DoubleValue.of(pid.getP()))
            .setKI(DoubleValue.of(pid.getI()))
            .setKD(DoubleValue.of(pid.getD()))
            .setKFStatic(DoubleValue.of(ff.getKs()))
            .setKFConstant(DoubleValue.of(ff.getKg()))
            .setKFLinear(DoubleValue.of(ff.getKv()))
            .setKFLinearPerTime(DoubleValue.of(ff.getKa()))
            .build();
        return out.toBuilder()
            .setGains(k)
            .build();
    }

}
