package CLIPPY.control;
import static edu.wpi.first.units.Units.Meters;
import static edu.wpi.first.units.Units.MetersPerSecond;
import static edu.wpi.first.units.Units.RPM;
import static edu.wpi.first.units.Units.Volts;

import com.google.protobuf.DoubleValue;

import CLIPPY.control.ControlGainsOuterClass.ControlGains;
import CLIPPY.control.SystemStateOuterClass.SystemState;
import edu.wpi.first.math.controller.ElevatorFeedforward;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.controller.ProfiledPIDController;
import edu.wpi.first.math.trajectory.TrapezoidProfile.Constraints;
import edu.wpi.first.units.measure.AngularVelocity;
import edu.wpi.first.units.measure.Distance;
import edu.wpi.first.units.measure.LinearVelocity;
import edu.wpi.first.units.measure.Voltage;
import frc.robot.constants.Config;

public abstract class WippyTuner extends AbstractTuner {
    private ElevatorFeedforward ff;
    private PIDController pid;
    private Double maxV, maxA, maxJ;
    private Constraints positionConstraints, velocityConstraints;
    private ProfiledPIDController ppos, pvel;

    public WippyTuner(String id, String... tags) {
        super(id, tags);
        this.ff = new ElevatorFeedforward(0, 0, 0, 0);
        this.pid = new PIDController(0, 0, 0, Config.LOOP_PERIOD);
        this.ppos = new ProfiledPIDController(0, 0, 0, null, Config.LOOP_PERIOD);
        this.pvel = new ProfiledPIDController(0, 0, 0, null, Config.LOOP_PERIOD);
    }

    @Override
    public WippyTuner setP(double kP) {
        pid.setP(kP);
        pvel.setP(kP);
        return this;
    }

    @Override
    public WippyTuner setI(double kI) {
        pid.setI(kI);
        pvel.setI(kI);
        return this;
    }

    @Override
    public WippyTuner setD(double kD) {
        pid.setD(kD);
        pvel.setD(kD);
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

    @Override
    public ITunableSystem setMaxVelocity(double max_mps) {
        maxV = max_mps;
        if (maxV != null && maxA != null) {
            positionConstraints = new Constraints(maxV, maxA);
            ppos.setConstraints(positionConstraints);
        }
        return this;
    }

    @Override
    public ITunableSystem setMaxAcceleration(double max_mpsps) {
        maxA = max_mpsps;
        if (maxV != null && maxA != null) {
            positionConstraints = new Constraints(maxV, maxA);
            ppos.setConstraints(positionConstraints);
        }
        if (maxA != null && maxJ != null) {
            velocityConstraints = new Constraints(maxA, maxJ);
            pvel.setConstraints(velocityConstraints);
        }
        return this;
    }

    @Override
    public ITunableSystem setMaxJerk(double max_mpspsps) {
        maxJ = max_mpspsps;
        if (maxA != null && maxJ != null) {
            velocityConstraints = new Constraints(maxA, maxJ);
            pvel.setConstraints(velocityConstraints);
        }
        return this;
    }

    protected boolean profiledPositionControlReady() {
        return positionConstraints != null;
    }

    protected boolean profiledVelocityControlReady() {
        return velocityConstraints != null;
    }

    // https://docs.wpilib.org/en/stable/docs/software/advanced-controls/controllers/profiled-pidcontroller.html
    @Override
    public Voltage calculate(Distance position) {
        if (!profiledPositionControlReady()) return Volts.zero();
        ppos.setGoal(position.in(Meters));
        return Volts.of(ppos.calculate(getPosition()) + ff.calculate(ppos.getSetpoint().velocity));
    }

    @Override
    public Voltage calculate(LinearVelocity velocity) {
        if (profiledVelocityControlReady()) {
            pvel.setGoal(velocity.in(MetersPerSecond));
            return Volts.of(pvel.calculate(getVelocity()) + ff.calculate(pvel.getSetpoint().position)); // FIXME unsure about this one
        } else {
            double ff = this.ff.calculate(velocity.in(MetersPerSecond));
            double fb = this.pid.calculate(getVelocity(), velocity.in(MetersPerSecond));
            return Volts.of(ff + fb);
        }
    }

    @Override
    public Voltage calculate(AngularVelocity velocity) {
        double ff = this.ff.calculate(velocity.in(RPM));
        double fb = this.pid.calculate(getVelocity(), velocity.in(RPM));
        return Volts.of(ff + fb);
    }

}
