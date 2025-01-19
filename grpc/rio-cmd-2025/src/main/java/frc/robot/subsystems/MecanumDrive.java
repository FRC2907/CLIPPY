package frc.robot.subsystems;

import static edu.wpi.first.units.Units.RadiansPerSecond;
import static edu.wpi.first.units.Units.Seconds;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.math.geometry.Transform2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj.drive.MecanumDrive.WheelSpeeds;
import edu.wpi.first.wpilibj2.command.Command;
import CLIPPY.control.SmaxTuner;
import frc.robot.constants.Ports.CAN;
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

        new SmaxTuner(front_left, "front left", "drivetrain", "drive", "mecanum");
        new SmaxTuner(rear_left, "rear left", "drivetrain", "drive", "mecanum");
        new SmaxTuner(front_right, "front right", "drivetrain", "drive", "mecanum");
        new SmaxTuner(rear_right, "rear right", "drivetrain", "drive", "mecanum");
    }
    private MecanumDrive() {
        this(
              new SparkMax(CAN.DT_FRONT_LEFT, MotorType.kBrushless)
            , new SparkMax(CAN.DT_REAR_LEFT, MotorType.kBrushless)
            , new SparkMax(CAN.DT_FRONT_RIGHT, MotorType.kBrushless)
            , new SparkMax(CAN.DT_REAR_RIGHT, MotorType.kBrushless)
        );
    }

    private static MecanumDrive instance;
    public static MecanumDrive getInstance() {
        if (instance == null) instance = new MecanumDrive();
        return instance;
    }

    @Override
    public Command drive(Transform2d vector) {
        return drive(new ChassisSpeeds(
              vector.getMeasureX().div(Seconds.one())
            , vector.getMeasureY().div(Seconds.one())
            , RadiansPerSecond.of(vector.getRotation().getRadians())
        ));
    }

    @Override
    public Command drive(ChassisSpeeds velocities) {
        return runOnce(() -> {
            drive.driveCartesian(velocities.vxMetersPerSecond, velocities.vyMetersPerSecond, velocities.omegaRadiansPerSecond, this.position.getRotation());
        });
    }

    public Command drive(WheelSpeeds velocities) {
        return runOnce(() -> {
            front_left.set(velocities.frontLeft);
            rear_left.set(velocities.rearLeft);
            front_right.set(velocities.frontRight);
            rear_right.set(velocities.rearRight);
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
