/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2129.robot.subsystems;

import org.usfirst.frc.team2129.robot.RobotMap;
import org.usfirst.frc.team2129.robot.commands.UserDriveCommand;
import org.usfirst.frc.team2129.util.speedcontrollers.SplitSpeedController;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveSubsystem extends Subsystem {
	private SpeedController leftGearbox;
	private SpeedController rightGearbox;
	private DifferentialDrive drive;
	
	public DriveSubsystem() {
		leftGearbox = new SplitSpeedController(RobotMap.driveLeft1.get(), RobotMap.driveLeft2.get());
		rightGearbox = new SplitSpeedController(RobotMap.driveRight1.get(), RobotMap.driveRight2.get());
		drive = new DifferentialDrive(leftGearbox, rightGearbox);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		 setDefaultCommand(new UserDriveCommand());
	}
	
	public void tankDrive(double left, double right) {
		drive.tankDrive(left, right);
	}
}
