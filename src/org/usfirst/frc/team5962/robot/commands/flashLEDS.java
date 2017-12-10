package org.usfirst.frc.team5962.robot.commands;

import org.usfirst.frc.team5962.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class flashLEDS  extends Command{
		public flashLEDS() {
			// Use requires() here to declare subsystem dependencies
			requires(Robot.ledFlashes);
			Robot.ledFlashes.deactivateThree();
		}

		// Called just before this Command runs the first time
		@Override
		protected void initialize() {
		}

		// Called repeatedly when this Command is scheduled to run
		@Override
		protected void execute() {
			Robot.ledFlashes.activateThree();
		}

		// Make this return true when this Command no longer needs to run execute()
		@Override
		protected boolean isFinished() {
			return false;
		}

		// Called once after isFinished returns true
		@Override
		protected void end() {
			Robot.ledFlashes.deactivateThree();
		}

		// Called when another command which requires one or more of the same
		// subsystems is scheduled to run
		@Override
		protected void interrupted() {
			end();
		}
}
