// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.ShooterThrustSubsystem;

public class ShooterThrust extends CommandBase {

  private final ShooterThrustSubsystem m_thrust;
  private double tPower;
    Joystick joystick = RobotContainer.driverController; 

  public ShooterThrust(ShooterThrustSubsystem thrust) {
    m_thrust = thrust; 
    tPower = 0.5; 
    addRequirements(m_thrust);
  }

  @Override
  public void execute() {
  

if (joystick.getRawButton(3)) {
  m_thrust.setVoltage(0.5);
   } else if (joystick.getRawButton(4)) { 
    m_thrust.setVoltage(-0.08);
   } 
    else { 
    m_thrust.setVoltage(0.00);
   }
  }


}
