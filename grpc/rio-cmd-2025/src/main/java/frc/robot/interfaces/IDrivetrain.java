package frc.robot.interfaces;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Transform2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj2.command.Command;

public interface IDrivetrain extends IPositionProvider {
    public Command drive(Transform2d vector);
    public Command drive(ChassisSpeeds velocities);
    public boolean arrivedAt(Pose2d waypoint);
    public boolean passed(Pose2d waypoint);
}
