package frc.robot.interfaces;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Transform2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj2.command.Command;

public interface IDrivetrain {
    public void forcePoseUpdate(Pose2d position);
    public Command driveTo(Pose2d waypoint);
    public Command drive(Transform2d vector);
    public Command drive(ChassisSpeeds velocities);
    public boolean arrivedAt(Pose2d waypoint);
}
