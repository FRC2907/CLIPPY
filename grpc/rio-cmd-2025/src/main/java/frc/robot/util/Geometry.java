package frc.robot.util;

import static edu.wpi.first.units.Units.Centimeter;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.units.measure.Distance;

public class Geometry {
    public static boolean CloseEnough(Pose2d a, Pose2d b) {
        Distance dx = a.getMeasureX().minus(b.getMeasureX());
        Distance dy = a.getMeasureY().minus(b.getMeasureY());
        Rotation2d dt = a.getRotation().minus(b.getRotation());
        return
               dx.lte(Centimeter.of(5))
            && dy.lte(Centimeter.of(5))
            && Math.abs(dt.getDegrees()) < 5;
    }
}
