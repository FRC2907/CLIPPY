package frc.robot.subsystems;

import static edu.wpi.first.units.Units.Meters;
import static edu.wpi.first.units.Units.MetersPerSecond;
import static edu.wpi.first.units.Units.RadiansPerSecond;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Transform2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.math.kinematics.DifferentialDriveOdometry;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.DifferentialDrive.WheelSpeeds;
import edu.wpi.first.wpilibj2.command.Command;
import CLIPPY.control.SmaxTuner;
import frc.robot.constants.Ports.CAN;
import frc.robot.interfaces.DrivetrainSubsystem;
import frc.robot.interfaces.IPositionProvider;

public class TankDrive extends DrivetrainSubsystem {
    private DifferentialDrive drive;
    public final Odometer odometer;

    protected class Odometer implements IPositionProvider {
        private DifferentialDriveOdometry odometer;
        public Odometer(Pose2d position) {
            forcePoseUpdate(position);
        }
        @Override
        public void forcePoseUpdate(Pose2d position) {
            this.odometer = new DifferentialDriveOdometry(position.getRotation(), Meters.zero(), Meters.zero(), position);
        }
        @Override
        public Pose2d getPose() {
            return odometer.getPoseMeters();
        }
    }

    public TankDrive(SparkMax left, SparkMax right) {
        this.drive = new DifferentialDrive(left, right);
        this.odometer = new Odometer(position);
        new SmaxTuner(left, "tank left", "drivetrain", "drive", "tank");
        new SmaxTuner(right, "tank right", "drivetrain", "drive", "tank");
    }
    public TankDrive(SparkMax left_a, SparkMax left_b, SparkMax right_a, SparkMax right_b) {
        this(left_a, right_a);
        left_b.configure(new SparkMaxConfig().follow(left_a), ResetMode.kNoResetSafeParameters, PersistMode.kNoPersistParameters);
        right_b.configure(new SparkMaxConfig().follow(right_a), ResetMode.kNoResetSafeParameters, PersistMode.kNoPersistParameters);
    }
    private TankDrive() {
        this(
              new SparkMax(CAN.DT_FRONT_LEFT, MotorType.kBrushless)
            , new SparkMax(CAN.DT_REAR_LEFT, MotorType.kBrushless)
            , new SparkMax(CAN.DT_FRONT_RIGHT, MotorType.kBrushless)
            , new SparkMax(CAN.DT_REAR_RIGHT, MotorType.kBrushless)
        );
    }

    private static TankDrive instance;
    public static TankDrive getInstance() {
        if (instance == null) instance = new TankDrive();
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
              MetersPerSecond.of(vector.getTranslation().getNorm())
            , MetersPerSecond.zero()
            , RadiansPerSecond.of(vector.getTranslation().getAngle().getRadians())
        ));
    }

    /**
     * FIXME reimplement this to actually use the real-speeds of ChassisSpeeds
     */
    @Override
    public Command drive(ChassisSpeeds velocities) {
        return runOnce(() -> {
            drive.arcadeDrive(velocities.vxMetersPerSecond, velocities.omegaRadiansPerSecond, false);
        });
    }

    public Command drive(WheelSpeeds velocities) {
        return runOnce(() -> {
            drive.tankDrive(velocities.left, velocities.right);
        });
    }

    @Override
    public void periodic() { }

    @Override
    public void simulationPeriodic() { }
}
