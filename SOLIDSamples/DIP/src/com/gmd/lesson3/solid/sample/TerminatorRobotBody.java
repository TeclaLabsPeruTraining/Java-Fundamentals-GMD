package com.gmd.lesson3.solid.sample;

/**
 * Created by emedinaa on 18/07/16.
 */
public class TerminatorRobotBody implements RobotBody {
    @Override
    public void walk() {
        System.out.println("NRobot Walk");
    }

    @Override
    public void shoot() {
        System.out.println("NRobot shoot");
    }

    @Override
    public void run() {
        System.out.println("NRobot run");
    }
}
