package frc.robot.control;

import CLIPPY.control.SystemStateOuterClass.SystemState;

public interface ISystem {
    /** Configure the target value for the system's output. */
    public ISystem setReference(double r);
    /** Configure the controller to use this input and bypass calculations. Set to null to resume normal control. */
    public ISystem setBypassInput(Double u);
    /** Configure the controller's proportional gain. */
    public ISystem setP(double kP);
    /** Configure the controller's integral gain. */
    public ISystem setI(double kI);
    /** Configure the controller's derivative gain. */
    public ISystem setD(double kD);
    /** Configure the controller's static friction feedforward gain, the maximum amount of input that will not move the system. See also setF_constant if there are constant forces working against the system. */
    public ISystem setF_static(double kF_static);
    /** Configure the controller's linear feedforward gain, the amount of input per output. */
    public ISystem setF_linear(double kF_linear);
    /** Configure the controller's "linear-per-time" feedforward gain, the amount of input per output per time. For a velocity controller, this is input per acceleration; for a position controller, this is input per velocity, I guess. */
    public ISystem setF_linear_per_time(double kF_lpt);
    /** Configure the controller's constant gravity gain. In an elevator, think of this as the midpoint voltage between "moving up" and "moving down", and kS is the distance from this midpoint to the threshold of motion. */
    public ISystem setF_constant(double kF_constant);
    /** Experimental: Configure the controller's PID gains according to Ziegler-Nichols.
     * Visit https://en.wikipedia.org/wiki/Ziegler%E2%80%93Nichols_method for more information.
     * @param Ku "Ultimate gain", a value for kP that produces stable and consistent oscillations.
     * @param Tu Time in seconds between peaks of an oscillation at kU.
     * @param style Control rule to configure.
     */
    public ISystem zieglify(double Ku, double Tu, ZNControlRule style);

    public SystemState buildSystemState();

    enum ZNControlRule {
        P, PI, PD, PID, PESSEN, MILD_OVERSHOOT, NO_OVERSHOOT
    }
}
