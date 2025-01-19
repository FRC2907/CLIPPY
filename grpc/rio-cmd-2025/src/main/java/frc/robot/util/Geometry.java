package frc.robot.util;

import static edu.wpi.first.units.Units.*;

import CLIPPY.control.WaypointOuterClass.Waypoint;
import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Transform2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.math.trajectory.Trajectory;
import edu.wpi.first.units.measure.Distance;
import edu.wpi.first.units.measure.LinearVelocity;
import edu.wpi.first.units.measure.Time;

public class Geometry {
    public static boolean closeEnough(Pose2d a, Pose2d b) {
        Distance dx = a.getMeasureX().minus(b.getMeasureX());
        Distance dy = a.getMeasureY().minus(b.getMeasureY());
        Rotation2d dt = a.getRotation().minus(b.getRotation());
        return
               dx.lte(Centimeter.of(5))
            && dy.lte(Centimeter.of(5))
            && Math.abs(dt.getDegrees()) < 5;
    }

    public static boolean downstreamOf(Pose2d test, Pose2d landmark) {
        return test.relativeTo(landmark).getY() >= 0; // waow
    }

    public static ChassisSpeeds chassisSpeedsFrom(Transform2d transform, Time duration) {
        return new ChassisSpeeds(
              transform.getMeasureX().div(duration)
            , transform.getMeasureY().div(duration)
            , Radians.of(transform.getRotation().getRadians()).div(duration)
        );
    }

    public static ChassisSpeeds chassisSpeedsFrom(Transform2d transform, LinearVelocity velocity) {
        return chassisSpeedsFrom(transform.div(velocity.in(MetersPerSecond)), Seconds.one());
    }

    public static Waypoint trajectoryStateToWaypoint(Trajectory.State state) {
        return Waypoint.newBuilder()
            .setTimestamp(frc.robot.util.Time.timestampFromTime(state.timeSeconds))
            .setX(state.poseMeters.getX())
            .setY(state.poseMeters.getY())
            .setTXy(state.poseMeters.getRotation().getDegrees())
            .build();
    }
}
