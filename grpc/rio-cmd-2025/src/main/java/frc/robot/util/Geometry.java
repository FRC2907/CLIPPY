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
    public static boolean closeEnough(Pose2d a, Pose2d b, Distance tolerance, Rotation2d rotolerance) {
        return a.minus(b).getTranslation().getNorm() <= tolerance.in(Meters) && Math.abs(a.minus(b).getRotation().getDegrees()) <= Math.abs(rotolerance.getDegrees());
    }
    public static boolean closeEnough(Pose2d a, Pose2d b) {
        return closeEnough(a, b, Centimeters.of(5), Rotation2d.fromDegrees(10));
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
