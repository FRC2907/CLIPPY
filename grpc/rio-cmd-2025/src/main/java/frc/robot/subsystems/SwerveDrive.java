package frc.robot.subsystems;

import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.interfaces.DrivetrainSubsystem;

public class SwerveDrive extends DrivetrainSubsystem {

    @Override
    public Command drive(ChassisSpeeds velocities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'drive'");
    }

    @Override
    public Command drive(Double... voltages) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'drive'");
    }

    @Override
    public void periodic() { }

    @Override
    public void simulationPeriodic() { }
}
