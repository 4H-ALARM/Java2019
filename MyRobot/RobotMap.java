package org.usfirst.frc2079.MyRobot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class RobotMap {
    private static Spark frontLeft;
    private static Spark backLeft;
    private static SpeedController left;
    private static Spark frontRight;
    private static Spark backRight;
    private static SpeedControllerGroup right;
    public static DifferentialDrive dtDrive;

    public static void init(){
        frontLeft = new Spark(0);
        frontLeft.setInverted(false);
        
        backLeft = new Spark(2);
        backLeft.setInverted(false);
        
        left = new SpeedControllerGroup(frontLeft, backLeft  );
        
        
        frontRight = new Spark(1);
        frontRight.setInverted(false);
        
        backRight = new Spark(3);
        backRight.setInverted(false);
        
        right = new SpeedControllerGroup(frontRight, backRight  );
        
        dtDrive = new DifferentialDrive(left, right);
    }
}