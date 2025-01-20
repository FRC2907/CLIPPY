package frc.robot.interfaces;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.util.Geometry;

public abstract class DrivetrainSubsystem extends SubsystemBase implements IDrivetrain {
    protected Pose2d position = new Pose2d();

    @Override
    public Pose2d getPose() { return position; }

    @Override
    public void forcePoseUpdate(Pose2d position) {
        this.position = position;
    }

    @Override
    public boolean arrivedAt(Pose2d waypoint) {
        return Geometry.closeEnough(position, waypoint);
    }

    @Override
    public boolean passed(Pose2d waypoint) {
        return Geometry.downstreamOf(position, waypoint);
    }
}
