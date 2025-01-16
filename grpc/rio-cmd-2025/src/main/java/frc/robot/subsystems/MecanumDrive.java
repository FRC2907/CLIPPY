package frc.robot.subsystems;

import static edu.wpi.first.units.Units.DegreesPerSecond;
import static edu.wpi.first.units.Units.Meters;
import static edu.wpi.first.units.Units.MetersPerSecond;
import static edu.wpi.first.units.Units.Seconds;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Transform2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.constants.Config;
import frc.robot.interfaces.DrivetrainSubsystem;

public class MecanumDrive extends DrivetrainSubsystem {
    private SparkMax front_left, rear_left, front_right, rear_right;
    private edu.wpi.first.wpilibj.drive.MecanumDrive drive;

    public MecanumDrive(SparkMax front_left, SparkMax rear_left, SparkMax front_right, SparkMax rear_right) {
        this.front_left = front_left;
        this.rear_left = rear_left;
        this.front_right = front_right;
        this.rear_right = rear_right;
        this.drive = new edu.wpi.first.wpilibj.drive.MecanumDrive(front_left, rear_left, front_right, rear_right);
    }
    private MecanumDrive() {
        this(
            new SparkMax(0, MotorType.kBrushless)
            , new SparkMax(1, MotorType.kBrushless)
            , new SparkMax(2, MotorType.kBrushless)
            , new SparkMax(3, MotorType.kBrushless)
        );
    }

    private static MecanumDrive instance;
    public static MecanumDrive getInstance() {
        if (instance == null) instance = new MecanumDrive();
        return instance;
    }

    @Override
    public Command driveTo(Pose2d waypoint) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'driveTo'");
    }

    @Override
    public Command drive(Transform2d vector) {
        double dx = vector.getMeasureX().in(Meters);
        double dy = vector.getMeasureY().in(Meters);
        double length = Math.hypot(dx, dy);
        double time = Meters.of(length).div(Config.MAX_TRANSLATION_VELOCITY).in(Seconds);
        double dt = vector.getRotation().getDegrees();
        return drive(new ChassisSpeeds(
              MetersPerSecond.of(dx/time)
            , MetersPerSecond.of(dy/time)
            , DegreesPerSecond.of(dt/time)));
    }

    @Override
    public Command drive(ChassisSpeeds velocities) {
        return runOnce(() -> {
            drive.driveCartesian(velocities.vxMetersPerSecond, velocities.vyMetersPerSecond, velocities.omegaRadiansPerSecond, this.position.getRotation());
        });
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
