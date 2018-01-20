package org.usfirst.frc.team2129.robot.commands;

import org.usfirst.frc.team2129.robot.OI;
import org.usfirst.frc.team2129.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class UserClimbCommand extends Command {
	
	public UserClimbCommand() {
		requires(Robot.s_Climber);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void execute() {
		Robot.s_Climber.setSpeed(OI.third.getY());
		SmartDashboard.putNumber("arm_enc_pos", Robot.s_Climber.encoder.getDistance());
		SmartDashboard.putNumber("arm_enc_vel", Robot.s_Climber.encoder.getRate());
	}

}
