package frc.robot.subsystems;

import static edu.wpi.first.units.Units.MetersPerSecond;
import static edu.wpi.first.units.Units.RadiansPerSecond;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.math.geometry.Transform2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.DifferentialDrive.WheelSpeeds;
import edu.wpi.first.wpilibj2.command.Command;
import CLIPPY.control.SmaxTuner;
import frc.robot.constants.Ports.CAN;
import frc.robot.interfaces.DrivetrainSubsystem;

public class TankDrive extends DrivetrainSubsystem {
    //private SparkMax left_a, left_b, right_a, right_b;
    private DifferentialDrive drive;

    public TankDrive(SparkMax left_a, SparkMax left_b, SparkMax right_a, SparkMax right_b) {
        //this.left_a = left_a;
        //this.left_b = left_b;
        //this.right_a = right_a;
        //this.right_b = right_b;
        left_b.configure(new SparkMaxConfig().follow(left_a), ResetMode.kNoResetSafeParameters, PersistMode.kNoPersistParameters);
        right_b.configure(new SparkMaxConfig().follow(right_a), ResetMode.kNoResetSafeParameters, PersistMode.kNoPersistParameters);
        this.drive = new DifferentialDrive(left_a, right_a);

        new SmaxTuner(left_a, "tank left", "drivetrain", "drive", "tank");
        new SmaxTuner(right_a, "tank right", "drivetrain", "drive", "tank");
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
    public Command drive(Transform2d vector) {
        return drive(new ChassisSpeeds(
              MetersPerSecond.of(vector.getTranslation().getNorm())
            , MetersPerSecond.zero()
            , RadiansPerSecond.of(vector.getTranslation().getAngle().getRadians())
        ));
    }

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
