// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.io.IOException;

import CLIPPY.grpc.SystemDataServer;
import CLIPPY.grpc.SystemTunerServer;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.*;
import frc.robot.bodges.GenericSixaxis;
import frc.robot.commands.*;
import frc.robot.constants.Ports;
import frc.robot.interfaces.DrivetrainSubsystem;
import frc.robot.subsystems.*;
import io.grpc.Server;
import io.grpc.ServerBuilder;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  private final DrivetrainSubsystem m_drivetrain = MecanumDrive.getInstance();

  private final SystemTunerServer m_systuner = SystemTunerServer.getInstance();
  private final SystemDataServer m_sysdata = SystemDataServer.getInstance();

  private final Server m_grpc_server = ServerBuilder
    .forPort(5800)
    .addService(m_systuner)
    .addService(m_sysdata)
    .build();

  // Replace with CommandPS4Controller or CommandJoystick if needed
  //private final CommandPS4Controller m_driver = new CommandPS4Controller(Ports.DRIVER_CONTROLLER_PORT);
  private final CommandJoystick m_driver = new CommandJoystick(Ports.DRIVER_CONTROLLER_PORT);
  private final GenericSixaxis m_driverAxes = new GenericSixaxis(m_driver.getHID());

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
    // Set up default command
    // https://github.com/wpilibsuite/allwpilib/blob/main/wpilibjExamples/src/main/java/edu/wpi/first/wpilibj/examples/mecanumcontrollercommand/RobotContainer.java#L47-L59
    m_drivetrain.setDefaultCommand(new ManualDrive(m_drivetrain, m_driverAxes::getLeftY, () -> -m_driverAxes.getLeftX(), m_driverAxes::getRightX));

    try { m_grpc_server.start(); } catch (IOException e) { e.printStackTrace(); }
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    // Schedule `ExampleCommand` when `exampleCondition` changes to `true`
    new Trigger(m_exampleSubsystem::exampleCondition)
        .onTrue(new ExampleCommand(m_exampleSubsystem));

    // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
    // cancelling on release.
    //m_driverController.b().whileTrue(m_exampleSubsystem.exampleMethodCommand());
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return Autos.exampleAuto(m_exampleSubsystem);
  }
}
