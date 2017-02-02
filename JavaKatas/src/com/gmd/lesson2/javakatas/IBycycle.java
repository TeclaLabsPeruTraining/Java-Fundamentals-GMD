package com.gmd.lesson2.javakatas;

/**
 * Created by eduardomedina on 2/02/17.
 */
public interface IBycycle {

    //  wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}
