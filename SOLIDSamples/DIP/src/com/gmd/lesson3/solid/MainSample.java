package com.gmd.lesson3.solid;

import com.gmd.lesson3.solid.sample.NRobot;
import com.gmd.lesson3.solid.sample.TerminatorRobotBody;

/**
 * Created by emedinaa on 18/07/16.
 */
public class MainSample {

    public static void main(String[] args) {
        NRobot nRobot= new NRobot(new TerminatorRobotBody());
        nRobot.findSarahConnor();
    }
}
