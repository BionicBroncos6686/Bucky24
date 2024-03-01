package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.PivotSubsystem;

public class PivotPowerCommand extends CommandBase {

    private final PivotSubsystem m_pivot;
    private double kPower;
    Joystick joystick = RobotContainer.driverController; 

    public PivotPowerCommand(PivotSubsystem pivot){
        m_pivot = pivot;
       
        kPower = 0.02; 
        addRequirements(m_pivot);

    }

    @Override
    public void execute(){
        
                if (joystick.getRawButton(1)) {
                    m_pivot.setVoltage(kPower);
                 } else if (joystick.getRawButton(2)) { 
                    m_pivot.setVoltage(-kPower);

                 } else { 
                    m_pivot.setVoltage(0);

                 }

              
    }
    
}