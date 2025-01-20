package frc.robot.subsystems;

import static edu.wpi.first.units.Units.MetersPerSecond;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkBaseConfig;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.math.kinematics.MecanumDriveKinematics;
import edu.wpi.first.math.kinematics.MecanumDriveOdometry;
import edu.wpi.first.math.kinematics.MecanumDriveWheelPositions;
import edu.wpi.first.math.kinematics.MecanumDriveWheelSpeeds;
import edu.wpi.first.units.measure.Voltage;
import edu.wpi.first.wpilibj2.command.Command;
import CLIPPY.control.ITunableSystem;
import CLIPPY.control.NullTuner;
import CLIPPY.control.SmaxTuner;
import frc.robot.constants.Physics;
import frc.robot.constants.Ports.CAN;
import frc.robot.interfaces.DrivetrainSubsystem;
import frc.robot.interfaces.IPositionProvider;

public class MecanumDrive extends DrivetrainSubsystem {
    private final ITunableSystem front_left, rear_left, front_right, rear_right;
    private final MecanumDriveKinematics kinematics;
    public final Odometer odometer;

    protected class Odometer implements IPositionProvider {
        private MecanumDriveOdometry odometer;
        public Odometer(Pose2d position) {
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

    private MecanumDrive(SparkMax front_left, SparkMax rear_left, SparkMax front_right, SparkMax rear_right, MecanumDriveKinematics kinematics) {
        this.front_left  = new SmaxTuner(front_left , "front left" , "drivetrain", "drive", "mecanum");
        this.rear_left   = new NullTuner(rear_left  , "rear left"  , "drivetrain", "drive", "mecanum");
        this.front_right = new NullTuner(front_right, "front right", "drivetrain", "drive", "mecanum");
        this.rear_right  = new NullTuner(rear_right , "rear right" , "drivetrain", "drive", "mecanum");
        ITunableSystem.setF_linear(Physics.Drivetrain.DefaultGains.kF_linear, this.front_left, this.front_right, this.rear_left, this.rear_right);

        SparkBaseConfig lefts = new SparkMaxConfig().apply(Physics.Drivetrain.ENCODER_SCALE);
        SparkBaseConfig rights = new SparkMaxConfig().apply(Physics.Drivetrain.ENCODER_SCALE).apply(Physics.Drivetrain.INVERT);
        front_left.configure(lefts, ResetMode.kResetSafeParameters, PersistMode.kNoPersistParameters);
        rear_left.configure(lefts, ResetMode.kResetSafeParameters, PersistMode.kNoPersistParameters);
        front_right.configure(rights, ResetMode.kResetSafeParameters, PersistMode.kNoPersistParameters);
        rear_right.configure(rights, ResetMode.kResetSafeParameters, PersistMode.kNoPersistParameters);

        this.kinematics = kinematics;
        this.odometer = new Odometer(position);
    }
    private MecanumDrive() {
        this(
              new SparkMax(CAN.DT_FRONT_LEFT, MotorType.kBrushless)
            , new SparkMax(CAN.DT_REAR_LEFT, MotorType.kBrushless)
            , new SparkMax(CAN.DT_FRONT_RIGHT, MotorType.kBrushless)
            , new SparkMax(CAN.DT_REAR_RIGHT, MotorType.kBrushless)
            , Physics.Drivetrain.DT_KINEMATICS_MECANUM
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
    public Command drive(ChassisSpeeds velocities) {
        MecanumDriveWheelSpeeds ws = kinematics.toWheelSpeeds(velocities);
        Voltage fl = front_left.calculate(MetersPerSecond.of(ws.frontLeftMetersPerSecond));
        Voltage rl = rear_left.calculate(MetersPerSecond.of(ws.rearLeftMetersPerSecond));
        Voltage fr = front_right.calculate(MetersPerSecond.of(ws.frontRightMetersPerSecond));
        Voltage rr = rear_right.calculate(MetersPerSecond.of(ws.rearRightMetersPerSecond));
        return drive(fl, rl, fr, rr);
    }

    /**
     * Front left, rear left, front right, rear right
     */
    @Override
    public Command drive(Double ...voltages) {
        return runOnce(() -> {
            front_left.setVoltage(voltages[0]);
            rear_left.setVoltage(voltages[1]);
            front_right.setVoltage(voltages[2]);
            rear_right.setVoltage(voltages[3]);
        });
    }

    @Override
    public void periodic() { }

    @Override
    public void simulationPeriodic() { }
}
