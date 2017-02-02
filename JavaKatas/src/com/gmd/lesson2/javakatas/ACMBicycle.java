package com.gmd.lesson2.javakatas;

/**
 * Created by eduardomedina on 2/02/17.
 */
public class ACMBicycle implements IBycycle {

    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;

    @Override
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    @Override
    public void changeGear(int newValue) {
        gear = newValue;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed= speed-decrement;
    }

    public void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}
