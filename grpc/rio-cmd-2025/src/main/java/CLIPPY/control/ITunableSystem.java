package CLIPPY.control;

import CLIPPY.control.SystemStateOuterClass.SystemState;
import edu.wpi.first.units.measure.AngularVelocity;
import edu.wpi.first.units.measure.Distance;
import edu.wpi.first.units.measure.LinearAcceleration;
import edu.wpi.first.units.measure.LinearVelocity;
import edu.wpi.first.units.measure.Voltage;
import frc.robot.util.Time;

import static edu.wpi.first.units.Units.MetersPerSecond;
import static edu.wpi.first.units.Units.MetersPerSecondPerSecond;
import static edu.wpi.first.units.Units.Volts;

import java.util.Set;

import CLIPPY.control.ControlGainsOuterClass.ZNControlRule;

public interface ITunableSystem {
    /** Get the system's ID string. */
    public String getID();
    /** Get the system's ID tags. */
    public Set<String> getIDTags();
    /** Return whether this system has the given tag. */
    default public boolean hasTag(String tag) {
        return getIDTags().contains(tag);
    }

    /** Configure the controller's proportional gain. */
    public ITunableSystem setP(double kP);
    /** Configure the controller's integral gain. */
    public ITunableSystem setI(double kI);
    /** Configure the controller's derivative gain. */
    public ITunableSystem setD(double kD);
    /** Configure the controller's static friction feedforward gain, the maximum amount of input that will not move the system. See also setF_constant if there are constant forces working against the system. */
    public ITunableSystem setF_static(double kF_static);
    /** Configure the controller's linear feedforward gain, the amount of input per output. */
    public ITunableSystem setF_linear(double kF_linear);
    /** Configure the controller's "linear-per-time" feedforward gain, the amount of input per output per time. For a velocity controller, this is input per acceleration; for a position controller, this is input per velocity, I guess. */
    public ITunableSystem setF_linear_per_time(double kF_lpt);
    /** Configure the controller's constant gravity gain. In an elevator, think of this as the midpoint voltage between "moving up" and "moving down", and kS is the distance from this midpoint to the threshold of motion. */
    public ITunableSystem setF_constant(double kF_constant);


    public ITunableSystem setMaxVelocity(double max_mps);
    public ITunableSystem setMaxAcceleration(double max_mpsps);
    public ITunableSystem setMaxJerk(double max_mpspsps);

    default public ITunableSystem setMaxVelocity(LinearVelocity max) {
        return setMaxVelocity(max.in(MetersPerSecond));
    }
    default public ITunableSystem setMaxAcceleration(LinearAcceleration max) {
        return setMaxAcceleration(max.in(MetersPerSecondPerSecond));
    }

    public double getPosition();
    public double getVelocity();
    public void setVoltage(double voltage);
    public default void setVoltage(Voltage voltage) { setVoltage(voltage.in(Volts)); }

    public Voltage calculate(Distance position);
    public Voltage calculate(LinearVelocity velocity);
    public Voltage calculate(AngularVelocity velocity);


    /** Experimental: Configure the controller's PID gains according to Ziegler-Nichols.
     * Visit https://en.wikipedia.org/wiki/Ziegler%E2%80%93Nichols_method for more information.
     * @param Ku "Ultimate gain", a value for kP that produces stable and consistent oscillations.
     * @param Tu Time in seconds between peaks of an oscillation at kU.
     * @param style Control rule to configure.
     */
    default public ITunableSystem zieglify(double Ku, double Tu, ZNControlRule style) {
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
                System.err.print("[warn] Attempted to set kU = " + Ku + " and tU = " + Tu + ", but either no Ziegler-Nichols control rule was specified, or it was specified as UNSET. Ignoring request.");
                return this;
        }
        double Kp = kKp * Ku;
        double Ti = kTi * Tu;
        double Td = kTd * Tu;
        setP(Kp);
        setI(Kp / Ti);
        setD(Kp * Td);
        return this;
    }

    default public SystemState buildSystemState() {
        return SystemState.newBuilder()
            .setTimestamp(Time.nowTimestamp())
            .setSystemId(getID())
            .build();
    }

    default public ITunableSystem clearFF() {
        setF_constant(0);
        setF_linear(0);
        setF_linear_per_time(0);
        setF_static(0);
        return this;
    }

    default public ITunableSystem clearPID() {
        setP(0);
        setI(0);
        setD(0);
        return this;
    }

    default public ITunableSystem clear() {
        clearFF();
        clearPID();
        return this;
    }

    public static void setP(double k, ITunableSystem ...systems)                       { for (ITunableSystem sys : systems) sys.setP(k); }
    public static void setI(double k, ITunableSystem ...systems)                       { for (ITunableSystem sys : systems) sys.setI(k); }
    public static void setD(double k, ITunableSystem ...systems)                       { for (ITunableSystem sys : systems) sys.setD(k); }
    public static void setF_static(double k, ITunableSystem ...systems)                { for (ITunableSystem sys : systems) sys.setF_static(k); }
    public static void setF_linear(double k, ITunableSystem ...systems)                { for (ITunableSystem sys : systems) sys.setF_linear(k); }
    public static void setF_linear_per_time(double k, ITunableSystem ...systems)       { for (ITunableSystem sys : systems) sys.setF_linear_per_time(k); }
    public static void setF_constant(double k, ITunableSystem ...systems)              { for (ITunableSystem sys : systems) sys.setF_constant(k); }
    public static void setMaxVelocity(double k, ITunableSystem ...systems)             { for (ITunableSystem sys : systems) sys.setMaxVelocity(k); }
    public static void setMaxAcceleration(double k, ITunableSystem ...systems)         { for (ITunableSystem sys : systems) sys.setMaxAcceleration(k); }
    public static void setMaxJerk(double k, ITunableSystem ...systems)                 { for (ITunableSystem sys : systems) sys.setMaxJerk(k); }

}
