package org.usfirst.frc.team2129.robot.subsystems;

import org.usfirst.frc.team2129.robot.RobotMap;
import org.usfirst.frc.team2129.robot.commands.UserClimbCommand;
import org.usfirst.frc.team2129.util.encoderdesc.iencoder.IEncoder;
import org.usfirst.frc.team2129.util.speedcontrollers.SplitSpeedController;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ClimberSubsystem extends Subsystem {
	
	private SpeedController gearbox;
	public IEncoder encoder;
	
	public ClimberSubsystem() {
		gearbox = new SplitSpeedController(RobotMap.climber1.get(), RobotMap.climber2.get());
		encoder = RobotMap.climberEncoder.get();
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new UserClimbCommand());
	}
	
	public void setSpeed(double v) {
		gearbox.set(v);
	}

}
