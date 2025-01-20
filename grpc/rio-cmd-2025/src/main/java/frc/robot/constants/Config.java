package frc.robot.constants;

import static edu.wpi.first.units.Units.MetersPerSecond;
import static edu.wpi.first.units.Units.MetersPerSecondPerSecond;
import static edu.wpi.first.units.Units.RotationsPerSecond;

import edu.wpi.first.units.measure.AngularVelocity;
import edu.wpi.first.units.measure.LinearAcceleration;
import edu.wpi.first.units.measure.LinearVelocity;

public class Config {
    public static final double LOOP_PERIOD = 1/50d;
    public static final LinearVelocity MAX_TRANSLATION_VELOCITY = MetersPerSecond.of(1);
    public static final AngularVelocity MAX_ROTATION_VELOCITY = RotationsPerSecond.of(1);

    public static final LinearVelocity MAX_WHEEL_VELOCITY = MetersPerSecond.of(1);
    public static final LinearAcceleration MAX_WHEEL_ACCEL = MetersPerSecondPerSecond.of(3);
    public static final double MAX_WHEEL_JERK = 5; // m/s/s/s

    public static class CLIPPY {
        public static final boolean DISABLE_ALL = false;
        public static final boolean ENABLE_SYSDATA = false;
        public static final boolean ENABLE_TUNER = true;
    }
}
