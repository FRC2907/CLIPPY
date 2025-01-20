package frc.robot.subsystems;

import static edu.wpi.first.units.Units.Meters;
import static edu.wpi.first.units.Units.MetersPerSecond;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkBaseConfig;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;
import edu.wpi.first.math.kinematics.DifferentialDriveOdometry;
import edu.wpi.first.math.kinematics.DifferentialDriveWheelSpeeds;
import edu.wpi.first.units.measure.Voltage;
import edu.wpi.first.wpilibj2.command.Command;
import CLIPPY.control.ITunableSystem;
import CLIPPY.control.SmaxTuner;
import frc.robot.constants.Physics;
import frc.robot.constants.Ports.CAN;
import frc.robot.interfaces.DrivetrainSubsystem;
import frc.robot.interfaces.IPositionProvider;

public class TankDrive extends DrivetrainSubsystem {
    private final ITunableSystem left, right;
    private final DifferentialDriveKinematics kinematics;
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

    private TankDrive(SparkMax left, SparkMax right, DifferentialDriveKinematics kinematics) {
        this.left = new SmaxTuner(left, "tank left", "drivetrain", "drive", "tank");
        this.right = new SmaxTuner(right, "tank right", "drivetrain", "drive", "tank");
        ITunableSystem.setF_linear(Physics.Drivetrain.DefaultGains.kF_linear, this.left, this.right);

        SparkBaseConfig lefts = new SparkMaxConfig().apply(Physics.Drivetrain.ENCODER_SCALE);
        SparkBaseConfig rights = new SparkMaxConfig().apply(Physics.Drivetrain.ENCODER_SCALE).apply(Physics.Drivetrain.INVERT);
        left.configure(lefts, ResetMode.kNoResetSafeParameters, PersistMode.kNoPersistParameters);
        right.configure(rights, ResetMode.kNoResetSafeParameters, PersistMode.kNoPersistParameters);

        this.kinematics = kinematics;
        this.odometer = new Odometer(position);
    }
    private TankDrive(SparkMax left_a, SparkMax left_b, SparkMax right_a, SparkMax right_b, DifferentialDriveKinematics kinematics) {
        this(left_a, right_a, kinematics);
        left_b.configure(new SparkMaxConfig().follow(left_a), ResetMode.kResetSafeParameters, PersistMode.kNoPersistParameters);
        right_b.configure(new SparkMaxConfig().follow(right_a), ResetMode.kResetSafeParameters, PersistMode.kNoPersistParameters);
    }
    private TankDrive() {
        this(
              new SparkMax(CAN.DT_FRONT_LEFT, MotorType.kBrushless)
            , new SparkMax(CAN.DT_REAR_LEFT, MotorType.kBrushless)
            , new SparkMax(CAN.DT_FRONT_RIGHT, MotorType.kBrushless)
            , new SparkMax(CAN.DT_REAR_RIGHT, MotorType.kBrushless)
            , Physics.Drivetrain.DT_KINEMATICS_DIFFY
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
    public Command drive(ChassisSpeeds velocities) {
        DifferentialDriveWheelSpeeds ws = kinematics.toWheelSpeeds(velocities);
        Voltage left = this.left.calculate(MetersPerSecond.of(ws.leftMetersPerSecond));
        Voltage right = this.right.calculate(MetersPerSecond.of(ws.rightMetersPerSecond));
        return drive(left, right);
    }

    /**
     * left, right
     */
    @Override
    public Command drive(Double ...voltages) {
        return runOnce(() -> {
            left.setVoltage(voltages[0]);
            right.setVoltage(voltages[1]);
        });
    }

    @Override
    public void periodic() { }

    @Override
    public void simulationPeriodic() { }
}
