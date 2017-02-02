package com.gmd.lesson2.javakatas;

/**
 * Created by eduardomedina on 2/02/17.
 */
public class MountainBike  extends Bicycle {

    @Override
    public void printStates() {

        System.out.println("MountainBike cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}
