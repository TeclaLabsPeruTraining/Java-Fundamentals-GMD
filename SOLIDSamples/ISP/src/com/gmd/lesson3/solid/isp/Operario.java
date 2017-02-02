package com.gmd.lesson3.solid.isp;

/**
 * Created by emedinaa on 18/07/16.
 */
public class Operario implements Trabajador {
    @Override
    public void trabaja() {
        System.out.println("Operario trabaja");
    }

    @Override
    public void incurre() {

    }
}
