package frc.robot.subsystems;

import static edu.wpi.first.units.Units.RadiansPerSecond;
import static edu.wpi.first.units.Units.Seconds;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Transform2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.math.kinematics.MecanumDriveKinematics;
import edu.wpi.first.math.kinematics.MecanumDriveOdometry;
import edu.wpi.first.math.kinematics.MecanumDriveWheelPositions;
import edu.wpi.first.wpilibj.drive.MecanumDrive.WheelSpeeds;
import edu.wpi.first.wpilibj2.command.Command;
import CLIPPY.control.SmaxTuner;
import frc.robot.constants.Physics;
import frc.robot.constants.Ports.CAN;
import frc.robot.interfaces.DrivetrainSubsystem;
import frc.robot.interfaces.IPositionProvider;

public class MecanumDrive extends DrivetrainSubsystem {
    private final SparkMax front_left, rear_left, front_right, rear_right;
    private final edu.wpi.first.wpilibj.drive.MecanumDrive drive;
    public final Odometer odometer;

    protected class Odometer implements IPositionProvider {
        private final MecanumDriveKinematics kinematics;
        private MecanumDriveOdometry odometer;
        public Odometer(MecanumDriveKinematics kinematics, Pose2d position) {
            this.kinematics = kinematics;
            forcePoseUpdate(position);
        }
        @Override
        public void forcePoseUpdate(Pose2d position) {
            this.odometer = new MecanumDriveOdometry(kinematics, position.getRotation(), new MecanumDriveWheelPositions(), position);
        }
        @Override
        public Pose2d getPose() {
            return odometer.getPoseMeters();
        }
    }

    public MecanumDrive(SparkMax front_left, SparkMax rear_left, SparkMax front_right, SparkMax rear_right, MecanumDriveKinematics kinematics) {
        this.front_left = front_left;
        this.rear_left = rear_left;
        this.front_right = front_right;
        this.rear_right = rear_right;
        this.drive = new edu.wpi.first.wpilibj.drive.MecanumDrive(front_left, rear_left, front_right, rear_right);
        this.odometer = new Odometer(kinematics, position);

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
            , Physics.DRIVETRAIN.DT_KINEMATICS
        );
    }

    private static MecanumDrive instance;
    public static MecanumDrive getInstance() {
        if (instance == null) instance = new MecanumDrive();
        return instance;
    }

    @Override
    public void forcePoseUpdate(Pose2d position) {
        super.forcePoseUpdate(position);
        odometer.forcePoseUpdate(position);
    }

    @Override
    public Command drive(Transform2d vector) {
        return drive(new ChassisSpeeds(
              vector.getMeasureX().div(Seconds.one())
            , vector.getMeasureY().div(Seconds.one())
            , RadiansPerSecond.of(vector.getRotation().getRadians())
        ));
    }

    /**
     * FIXME reimplement this to actually use the real-speeds of ChassisSpeeds
     */
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
    public void periodic() { }

    @Override
    public void simulationPeriodic() { }
}
