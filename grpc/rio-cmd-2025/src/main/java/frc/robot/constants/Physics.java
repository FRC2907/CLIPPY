package frc.robot.constants;

import static edu.wpi.first.units.Units.Inches;
import static edu.wpi.first.units.Units.Meters;
import static edu.wpi.first.units.Units.MetersPerSecond;
import static edu.wpi.first.units.Units.RPM;
import static edu.wpi.first.units.Units.Value;

import com.revrobotics.spark.config.EncoderConfig;
import com.revrobotics.spark.config.SparkBaseConfig;
import com.revrobotics.spark.config.SparkMaxConfig;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;
import edu.wpi.first.math.kinematics.MecanumDriveKinematics;
import edu.wpi.first.math.system.plant.DCMotor;
import edu.wpi.first.units.measure.AngularVelocity;
import edu.wpi.first.units.measure.Dimensionless;
import edu.wpi.first.units.measure.Distance;
import edu.wpi.first.units.measure.LinearVelocity;

public class Physics {
    public static final double SECONDS_PER_MINUTE = 60; // please for the love of god do not change this. leap seconds prohibited during matches
    public static final double MINUTES_PER_SECOND = 1/SECONDS_PER_MINUTE;
    public static class Drivetrain {
        public static final Distance TRACK_WIDTH = Inches.of(26);
        public static final Distance WHEEL_BASE = Inches.of(30);
        public static final Distance WHEEL_DIAMETER = Inches.of(6);
        public static final Dimensionless GEAR_RATIO = Value.of(5.95); // motor spins faster than wheel

        public static final MecanumDriveKinematics DT_KINEMATICS_MECANUM = new MecanumDriveKinematics(
              new Translation2d(WHEEL_BASE.div(2),              TRACK_WIDTH.div(2)             )
            , new Translation2d(WHEEL_BASE.div(2),              TRACK_WIDTH.div(2).unaryMinus())
            , new Translation2d(WHEEL_BASE.div(2).unaryMinus(), TRACK_WIDTH.div(2)             )
            , new Translation2d(WHEEL_BASE.div(2).unaryMinus(), TRACK_WIDTH.div(2).unaryMinus())
        );
        public static final DifferentialDriveKinematics DT_KINEMATICS_DIFFY = new DifferentialDriveKinematics(TRACK_WIDTH);

        public static final Distance WHEEL_RADIUS = WHEEL_DIAMETER.div(2);
        public static final Distance WHEEL_CIRCUMFERENCE = WHEEL_DIAMETER.times(Math.PI);
        public static final Dimensionless WHEEL_RPM_PER_MOTOR_RPM = Value.one().div(GEAR_RATIO);
        public static AngularVelocity WheelRPMfromMotorRPM(AngularVelocity mRPM) { return mRPM.times(WHEEL_RPM_PER_MOTOR_RPM); }
        public static LinearVelocity WheelSpeedFromWheelRPM(AngularVelocity wRPM) {
            return MetersPerSecond.of(wRPM.in(RPM) * MINUTES_PER_SECOND * WHEEL_CIRCUMFERENCE.in(Meters));
        }
        public static LinearVelocity WheelSpeedFromMotorRPM(AngularVelocity mRPM) { return WheelSpeedFromWheelRPM(WheelRPMfromMotorRPM(mRPM)); }
        public static final double METERS_PER_MOTOR_REV = WHEEL_CIRCUMFERENCE.div(GEAR_RATIO).in(Meters);
        public static final double METERS_PER_MOTOR_RAD = METERS_PER_MOTOR_REV / (2*Math.PI);
        public static final EncoderConfig ENCODER_SCALE = new EncoderConfig()
            .positionConversionFactor(METERS_PER_MOTOR_REV)
            .velocityConversionFactor(WheelSpeedFromMotorRPM(RPM.one()).in(MetersPerSecond));
        public static final SparkBaseConfig INVERT = new SparkMaxConfig().inverted(true);

        public static final DCMotor MOTOR = DCMotor.getNEO(1);
        public static class DefaultGains {
            public static final double kF_linear = MOTOR.nominalVoltageVolts / (MOTOR.freeSpeedRadPerSec * METERS_PER_MOTOR_RAD);
        }
    }
}
