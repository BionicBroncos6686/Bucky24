// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.motorcontrol.Spark;

public class Drivetrain extends SubsystemBase {
  
  Spark leftFrontSpark = null; 
  Spark leftRearSpark = null; 
  Spark rightFrontSpark = null; 
  Spark rightRearSpark = null; 

  MotorControllerGroup leftMotors = null;
  MotorControllerGroup rightMotors = null; 

  DifferentialDrive differentialDrive = null; 

  public Drivetrain(){
   leftFrontSpark = new Spark(Constants.DRIVETRAIN_LEFT_FRONT_SPARK);
   leftRearSpark = new Spark(Constants.DRIVETRAIN_LEFT_REAR_SPARK);
   rightFrontSpark = new Spark(Constants.DRIVETRAIN_RIGHT_FRONT_SPARK);
   rightRearSpark = new Spark(Constants.DRIVETRAIN_RIGHT_REAR_SPARK);

  leftMotors = new MotorControllerGroup(leftFrontSpark, leftRearSpark);
  rightMotors = new MotorControllerGroup(rightFrontSpark, rightRearSpark);

  differentialDrive = new DifferentialDrive(leftMotors, rightMotors);

  }

  public void arcadeDrive(double moveSpeed, double rotateSpeed) { 
    differentialDrive.arcadeDrive(moveSpeed, rotateSpeed);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
