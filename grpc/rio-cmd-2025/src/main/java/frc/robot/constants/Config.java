package frc.robot.constants;

import static edu.wpi.first.units.Units.MetersPerSecond;
import edu.wpi.first.units.measure.LinearVelocity;

public class Config {
    public static final double LOOP_PERIOD = 1/50d;
    public static final double MAX_TRANSLATION_VELOCITY_METER_PER_SECOND = 3;
    public static final LinearVelocity MAX_TRANSLATION_VELOCITY = MetersPerSecond.of(MAX_TRANSLATION_VELOCITY_METER_PER_SECOND);
}
