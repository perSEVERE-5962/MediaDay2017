package org.usfirst.frc.team5962.robot.commands;

import org.usfirst.frc.team5962.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RunJoystickTank extends Command {

	//private JoystickThrottle throttle = new JoystickThrottle();
	public  RunJoystickTank() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drive.joystickTank();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	 //Robot.oi.gameArcadeMode.get()
        	//     || Robot.oi.gameXArcadeMode.get()
        		// || Robot.oi.joystickArcadeModeRight.get()
        		 //|| Robot.oi.joystickArcadeModeLeft.get()
        		 //|| Robot.oi.gameXTankMode.get()
       return false;// return  Robot.oi.joystickTankMode.get();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}

	
	
	
	
	
	


