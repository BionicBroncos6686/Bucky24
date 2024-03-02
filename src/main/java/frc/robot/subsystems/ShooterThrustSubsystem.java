// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterThrustSubsystem extends SubsystemBase {
  private final VictorSPX ThrustMotor;
  /** Creates a new ShooterThrustSubsystem. */
  public ShooterThrustSubsystem() {
    ThrustMotor = new VictorSPX(8);
    ThrustMotor.setInverted(true);
    ThrustMotor.setNeutralMode(NeutralMode.Brake);
  }
  public void setVoltage(double power){
    double voltage = power * 12;
    ThrustMotor.set(ControlMode.PercentOutput, voltage);
}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
