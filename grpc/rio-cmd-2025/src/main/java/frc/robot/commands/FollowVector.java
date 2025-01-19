package frc.robot.commands;

import static edu.wpi.first.units.Units.MetersPerSecond;

import java.util.List;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Transform2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.math.trajectory.Trajectory;
import edu.wpi.first.math.trajectory.Trajectory.State;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.interfaces.DrivetrainSubsystem;
import frc.robot.util.Geometry;

public class FollowVector extends Command {
    private final DrivetrainSubsystem dt;
    private final Transform2d vector;
    private Pose2d destination;
    private Timer t;
    private Trajectory tj;
    public FollowVector(DrivetrainSubsystem drivetrain, Transform2d vector) {
        this.dt = drivetrain;
        this.vector = vector;
        addRequirements(drivetrain);
    }

    @Override
    public void initialize() {
        t = new Timer();
        destination = new Pose2d(vector.getTranslation(), vector.getRotation()).relativeTo(dt.getPose());
        tj = new Trajectory(List.of(
              new State(0, 0, 0, dt.getPose(), 0)
            , new State(5, 0, 0, destination, 0))
            );
        t.start();
    }

    @Override
    public void execute() {
        State s = tj.sample(t.get());
        Transform2d tr = s.poseMeters.minus(dt.getPose());
        ChassisSpeeds cs = Geometry.chassisSpeedsFrom(tr, MetersPerSecond.of(s.velocityMetersPerSecond));
        dt.drive(cs).execute();
    }

    @Override
    public boolean isFinished() {
        return t.get() >= tj.getTotalTimeSeconds() || dt.arrivedAt(destination);
    }
}
