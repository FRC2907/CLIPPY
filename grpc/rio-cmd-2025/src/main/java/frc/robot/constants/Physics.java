package frc.robot.constants;

import static edu.wpi.first.units.Units.Inches;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.MecanumDriveKinematics;
import edu.wpi.first.units.measure.Distance;

public class Physics {
    public static class DRIVETRAIN {
        public static final Distance TRACK_WIDTH = Inches.of(26);
        public static final Distance WHEEL_BASE = Inches.of(30);
        public static final MecanumDriveKinematics DT_KINEMATICS = new MecanumDriveKinematics(
              new Translation2d(WHEEL_BASE.div(2),              TRACK_WIDTH.div(2)             )
            , new Translation2d(WHEEL_BASE.div(2),              TRACK_WIDTH.div(2).unaryMinus())
            , new Translation2d(WHEEL_BASE.div(2).unaryMinus(), TRACK_WIDTH.div(2)             )
            , new Translation2d(WHEEL_BASE.div(2).unaryMinus(), TRACK_WIDTH.div(2).unaryMinus())
        );
    }
}
