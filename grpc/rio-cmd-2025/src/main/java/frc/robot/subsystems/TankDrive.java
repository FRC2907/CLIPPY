package frc.robot.subsystems;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Transform2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.interfaces.DrivetrainSubsystem;

public class TankDrive extends DrivetrainSubsystem {

    @Override
    public Command driveTo(Pose2d waypoint) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'driveTo'");
    }

    @Override
    public Command drive(Transform2d vector) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'drive'");
    }

    @Override
    public Command drive(ChassisSpeeds velocities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'drive'");
    }

    @Override
    public boolean arrivedAt(Pose2d waypoint) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'arrivedAt'");
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }
}
