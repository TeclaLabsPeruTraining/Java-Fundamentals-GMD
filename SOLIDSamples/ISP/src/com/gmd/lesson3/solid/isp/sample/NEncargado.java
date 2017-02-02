package com.gmd.lesson3.solid.isp.sample;

/**
 * Created by emedinaa on 18/07/16.
 */
public class NEncargado implements Incurridor,NTrabajador {
    @Override
    public void incurre() {
        System.out.println("incurre Encargado ");
    }

    @Override
    public void trabaja() {
        System.out.println("trabaja Encargado ");
    }
}
