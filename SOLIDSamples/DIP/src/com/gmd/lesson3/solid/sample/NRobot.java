package com.gmd.lesson3.solid.sample;

/**
 * Created by emedinaa on 18/07/16.
 */
public class NRobot {

    private final RobotBody  robotBody;

    public NRobot(RobotBody robotBody) {
        this.robotBody = robotBody;
    }
    public void findSarahConnor(){
        this.robotBody.run();
        this.robotBody.walk();
        this.robotBody.shoot();
    }
}
