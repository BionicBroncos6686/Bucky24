package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.PivotSubsystem;

public class PivotPowerCommand extends CommandBase {

    private final PivotSubsystem m_pivot;
    private double kPower;

    public PivotPowerCommand(PivotSubsystem pivot, double power){
        m_pivot = pivot;
        kPower = power;
        addRequirements(m_pivot);

    }

    @Override
    public void execute(){
        m_pivot.setVoltage(kPower);

    }
    
}