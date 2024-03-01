package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PivotSubsystem extends SubsystemBase {

    private final VictorSPX pivotMotor;

    public PivotSubsystem(){
        pivotMotor = new VictorSPX(5);
        pivotMotor.setInverted(true);
        pivotMotor.setNeutralMode(NeutralMode.Brake);
    }

    public void setVoltage(double power){
        double voltage = power * 12;
        pivotMotor.set(ControlMode.PercentOutput, voltage);
    }
    
}
