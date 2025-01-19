package frc.robot.interfaces;

import CLIPPY.control.WaypointOuterClass.Waypoint;
import edu.wpi.first.math.geometry.Pose2d;
import frc.robot.util.Time;

public interface IPositionProvider {
    public void forcePoseUpdate(Pose2d position);
    public Pose2d getPose();
    public default Waypoint getPosition() {
        return Waypoint.newBuilder()
            .setTimestamp(Time.nowTimestamp())
            .setX(getPose().getX())
            .setY(getPose().getY())
            .setTXy(getPose().getRotation().getDegrees())
        .build();
    }
}
