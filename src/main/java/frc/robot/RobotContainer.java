// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


import frc.robot.commands.DriveArcade;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.PivotPowerCommand;
import frc.robot.commands.ShooterThrust;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.PivotSubsystem;
import frc.robot.subsystems.ShooterThrustSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  public static final Drivetrain m_drivetrain = new Drivetrain();
  public final PivotSubsystem m_pivot = new PivotSubsystem();
  public final ShooterThrustSubsystem m_thrust = new ShooterThrustSubsystem();
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  
  public static Joystick driverController = new Joystick(Constants.DRIVER_CONTROLLER);
  CommandXboxController TCommandController = new CommandXboxController(0); // Creates a CommandXboxController on port 1.
  Trigger xButton = TCommandController.x(); // Creates a new Trigger object for the `X` button on exampleCommandController
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();

    // Set default commands on subsystems
    m_drivetrain.setDefaultCommand(new DriveArcade());
    m_pivot.setDefaultCommand(new PivotPowerCommand(m_pivot));
    m_thrust.setDefaultCommand(new ShooterThrust(m_thrust));
  
  }

    /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
