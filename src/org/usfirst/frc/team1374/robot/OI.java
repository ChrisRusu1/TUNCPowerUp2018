package org.usfirst.frc.team1374.robot;

import org.usfirst.frc.team1374.robot.Util.Xbox360Controller;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    private static final Xbox360Controller Driver = new Xbox360Controller(0);
    private static final Xbox360Controller Operator = new Xbox360Controller(1);

    // driver
    public static double getDriverSpeed() { return Driver.getLeftTrigger() - Driver.getRightTrigger(); }
    public static double getSteer() { return Driver.getLeftXAxis(); }
    //public static boolean distanceDrive() { return Driver.getButtonA(); }
    public static boolean getHighGear() { return Driver.getButtonA(); }
    public static boolean getLowGear() { return Driver.getButtonB(); }

    // operator
    public static boolean getClimber() { return Operator.getButtonY(); }
    public static double getIntake() { return Operator.getRightYAxis(); }
    public static double getIntakeArm() { return Operator.getLeftYAxis(); }
    public static boolean getArmUp() { return Operator.getButtonA(); }
    public static boolean getArmDown() { return Operator.getButtonB(); }
    public static boolean getFlipperIn() { return Operator.getButtonRB(); }
    public static boolean getFlipperOut() { return Operator.getButtonLB(); }
    
    /*                                 Controls
     * Driver
     * Right trigger-forwards
     * Left trigger-backwards
     * Left stick-steer
     * A-B-gear switches
     *
     *
     *                                 Operator
     * Y-climb
     * Right bumper Left bumper-open,close the grabber
     * Left Y axis-raise or lower the grabber
     * Right Y axis-push the block and bring back the pusher
     */
    
    /**Usage:
     *
     * private static final Xbox360Controller JS_DRIVER = new Xbox360Controller(int port,double deadzone)
     *
     * Example:
     *
     * public static void getDriverSpeed()
     * {
     * return DRIVER.getRightTrigger() - DRIVER.getLeftTrigger()
     * }
     */
}
