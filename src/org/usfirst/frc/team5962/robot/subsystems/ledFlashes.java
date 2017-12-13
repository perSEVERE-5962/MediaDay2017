package org.usfirst.frc.team5962.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Solenoid;

public class ledFlashes extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	static Solenoid s3 = new Solenoid(3);
	static Solenoid s4 = new Solenoid(4);
	static Solenoid s5 = new Solenoid(5);
	
	
	
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
	
	public void activateThree()
	{
		s3.set(true);
	}
	
	public void deactivateThree()
	{
		s3.set(false);
	}
}
