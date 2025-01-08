// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.io.IOException;

import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.CLIPPY.RobotController;
import frc.robot.CLIPPY.SystemDataServer;
import frc.robot.constants.Settings;
import frc.robot.control.SparkMax;
import frc.robot.flow.Registry;
import frc.robot.flow.Watchdog;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  private Registry r = Registry.getInstance();
  private SystemDataServer sysDataSvc = SystemDataServer.getInstance();

  public Robot() {
    super(Settings.MAIN_LOOP_TIME);
  }

  @Override
  public void robotInit() {
    r.loopers.add(new Watchdog());

    new SparkMax("dummy", new com.revrobotics.spark.SparkMax(0, MotorType.kBrushless));

    r.loopers.forEach(looper -> looper.init());

    try {
      Grpc
      .newServerBuilderForPort(5800, InsecureServerCredentials.create())
      .addService(SystemDataServer.getInstance())
      .addService(RobotController.getInstance())
      .build()
      .start();
    } catch (IOException e) {e.printStackTrace();}

  }

  @Override
  public void robotPeriodic() {
    // collect metrics before updating references
    // this way the inputs are better associated with the outputs they begat
    r.systems.forEach((id, system) -> {
      sysDataSvc.submit(system.buildSystemState());
    });

    r.loopers.forEach(looper -> looper.loop());
  }

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {}

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
