package frc.robot.commands;

import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.bodges.GenericSixaxis;
import frc.robot.interfaces.DrivetrainSubsystem;

public class ManualDrive extends Command {
    private final DrivetrainSubsystem m_drivetrain;
    private final GenericSixaxis m_hid;
    public ManualDrive(DrivetrainSubsystem drivetrain, GenericSixaxis hid) {
        m_drivetrain = drivetrain;
        m_hid = hid;
        addRequirements(drivetrain);
    }

    @Override
    public void execute() {
        m_drivetrain.drive(new ChassisSpeeds(
            m_hid.getLeftY()
             , -m_hid.getLeftX()
             , m_hid.getRightX()
             ));
    }
}
