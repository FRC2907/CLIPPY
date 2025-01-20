package frc.robot.interfaces;

import static edu.wpi.first.units.Units.Volts;

import java.util.Arrays;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.units.measure.Voltage;
import edu.wpi.first.wpilibj2.command.Command;

public interface IDrivetrain extends IPositionProvider {
    public Command drive(ChassisSpeeds velocities);
    default public Command drive(Voltage ...voltages) {
        // https://stackoverflow.com/a/40902361/6627273
        return drive((Arrays.stream(voltages).map(v -> v.in(Volts)).toArray(Double[]::new)));
    }
    public Command drive(Double ...voltages);
    public boolean arrivedAt(Pose2d waypoint);
    public boolean passed(Pose2d waypoint);
}
