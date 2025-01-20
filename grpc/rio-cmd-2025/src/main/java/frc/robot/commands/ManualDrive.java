package frc.robot.commands;

import static edu.wpi.first.units.Units.MetersPerSecond;
import static edu.wpi.first.units.Units.RadiansPerSecond;

import java.util.function.DoubleSupplier;

import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.constants.Config;
import frc.robot.interfaces.DrivetrainSubsystem;
import frc.robot.util.Algebra;

public class ManualDrive extends Command {
    private final DrivetrainSubsystem dt;
    private final DoubleSupplier x, y, r;
    public ManualDrive(DrivetrainSubsystem drivetrain, DoubleSupplier x, DoubleSupplier y, DoubleSupplier r) {
        this.dt = drivetrain;
        this.x = x;
        this.y = y;
        this.r = r;
        addRequirements(drivetrain);
    }

    @Override
    public void execute() {
        double x = this.x.getAsDouble();
        double y = this.y.getAsDouble();
        // normalize so that the length(<x,y>) <= 1
        double[] velocities = Math.hypot(x, y) > 1 ? Algebra.normalizeToCircle(x, y) : new double[]{x, y};
        dt.drive(new ChassisSpeeds(
               velocities[0]   * Config.MAX_TRANSLATION_VELOCITY.in(MetersPerSecond)
             , velocities[1]   * Config.MAX_TRANSLATION_VELOCITY.in(MetersPerSecond)
             , r.getAsDouble() * Config.MAX_ROTATION_VELOCITY   .in(RadiansPerSecond)
             )).schedule();
    }
}
