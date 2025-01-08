package frc.robot.control;

public interface IGenericPIDController {
    /** Configure the controller's proportional gain. */
    public IGenericPIDController setP(double kP);
    /** Configure the controller's integral gain. */
    public IGenericPIDController setI(double kI);
    /** Configure the controller's derivative gain. */
    public IGenericPIDController setD(double kD);
    /** Configure the controller's static friction feedforward gain, the maximum amount of input that will not move the system. See also setF_constant if there are constant forces working against the system. */
    public IGenericPIDController setF_static(double kF_static);
    /** Configure the controller's linear feedforward gain, the amount of input per output. */
    public IGenericPIDController setF_linear(double kF_linear);
    /** Configure the controller's "linear-per-time" feedforward gain, the amount of input per output per time. For a velocity controller, this is input per acceleration; for a position controller, this is input per velocity, I guess. */
    public IGenericPIDController setF_linear_per_time(double kF_lpt);
    /** Configure the controller's constant gravity gain. In an elevator, think of this as the midpoint voltage between "moving up" and "moving down", and kS is the distance from this midpoint to the threshold of motion. */
    public IGenericPIDController setF_constant(double kF_constant);
    /** Experimental: Configure the controller's PID gains according to Ziegler-Nichols.
     * Visit https://en.wikipedia.org/wiki/Ziegler%E2%80%93Nichols_method for more information.
     * @param Ku "Ultimate gain", a value for kP that produces stable and consistent oscillations.
     * @param Tu Time in seconds between peaks of an oscillation at kU.
     * @param style Control rule to configure.
     */
    public IGenericPIDController zieglify(double Ku, double Tu, ZNControlRule style);

    enum ZNControlRule {
        P, PI, PD, PID, PESSEN, MILD_OVERSHOOT, NO_OVERSHOOT
    }
}
