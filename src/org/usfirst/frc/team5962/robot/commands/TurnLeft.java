package org.usfirst.frc.team5962.robot.commands;

import org.usfirst.frc.team5962.robot.Robot;
import org.usfirst.frc.team5962.robot.RobotMap;
// import org.usfirst.frc.team5962.robot.sensors.RobotGyro;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class TurnLeft extends Command{
	boolean gyrostop = true;
	boolean isFinished = false;
	public TurnLeft() {
		   requires(Robot.drive);

	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	public void execute() {
		SmartDashboard.putString("gyro", "" + Robot.gyro.getGyroAngle());
		RobotMap.myRobot.setMaxOutput(1);
		if (gyrostop)
			Robot.gyro.resetGyro();
		isFinished = false;
		gyrostop = false;
		if (Robot.gyro.getGyroAngle() > -90)
		RobotMap.myRobot.drive(-0.25, 1); // turn left-
		else { RobotMap.myRobot.drive(0, 0);
		gyrostop = true;
		isFinished = true;
		RobotMap.myRobot.setMaxOutput(0.5);
		Robot.oi.startDriveCommand();
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		//if (gyrostop)
		//	Robot.gyro.resetGyro();
		return isFinished;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
	
	

	}

