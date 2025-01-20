package frc.robot.constants;

import static edu.wpi.first.units.Units.MetersPerSecond;
import static edu.wpi.first.units.Units.RotationsPerSecond;

import edu.wpi.first.units.measure.AngularVelocity;
import edu.wpi.first.units.measure.LinearVelocity;

public class Config {
    public static final double LOOP_PERIOD = 1/50d;
    public static final LinearVelocity MAX_TRANSLATION_VELOCITY = MetersPerSecond.of(1);
    public static final AngularVelocity MAX_ROTATION_VELOCITY = RotationsPerSecond.of(1);
}
