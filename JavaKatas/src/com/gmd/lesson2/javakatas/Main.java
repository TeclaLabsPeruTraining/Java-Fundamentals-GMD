package com.gmd.lesson2.javakatas;

/**
 * Created by eduardomedina on 2/02/17.
 */
public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello Java !");

        init();
        //initInherance();
        //initInterfaces();
    }

    private static void initInherance() {

        Bicycle bike1 = new Bicycle();
        MountainBike mountainBike = new MountainBike();

        bike1.printStates();

        mountainBike.printStates();
    }

    private static void initInterfaces() {

        ACMEBicycle bike1 = new ACMEBicycle();
        bike1.printStates();
    }

    private  static void init() {

        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);


        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);

        bike1.printStates();
        bike2.printStates();
    }
}
