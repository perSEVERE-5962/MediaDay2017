package org.usfirst.frc.team5962.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team5962.robot.commands.flashLEDS;
import org.usfirst.frc.team5962.robot.subsystems.ledFlashes;
import org.usfirst.frc.team5962.robot.commands.RunArcadeGame;
import org.usfirst.frc.team5962.robot.commands.RunJoystickTank;
import org.usfirst.frc.team5962.robot.commands.Throttle;
import org.usfirst.frc.team5962.robot.commands.TurnLeft;
import org.usfirst.frc.team5962.robot.commands.TurnRight;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {
	TurnLeft turnLeft = new TurnLeft();
	TurnRight turnRight = new TurnRight();
	public Joystick joystickLeft;
	public Button turnLeftBtn;
	public Button turnRightBtn;
	public Joystick joystickRight;

	 	public Button ledFlashes;
	 	
	 	public Button throttle;
	 	private boolean throttleEnabled = false;
	 	
	public OI() {
		joystickLeft = new Joystick(1);
		joystickRight = new Joystick(2);
		turnLeftBtn = new JoystickButton(joystickLeft, 2);
		turnLeftBtn.whenPressed(turnLeft);
		turnRightBtn = new JoystickButton(joystickLeft, 3);
		turnRightBtn.whenPressed(turnRight);
		ledFlashes = new JoystickButton(joystickLeft, 4);
		ledFlashes.whenPressed(new flashLEDS());
		throttle = new JoystickButton(joystickLeft, 1);
		throttle.whenPressed(new Throttle());
	}
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);
	

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	
	public void startDriveCommand() {
		//Command command = new RunJoystickTank();
		Command command = new RunArcadeGame();
		command.start();
	}
	
	public boolean isThrottleEnabled() {
		return throttleEnabled;
	}
	
	public void toggleThrottle() {
		throttleEnabled = !throttleEnabled;
		SmartDashboard.putString("throttle enabled", "" + throttleEnabled);
	}
}
