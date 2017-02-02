package com.gmd.lesson3.solid.isp.sample;

/**
 * Created by emedinaa on 18/07/16.
 */
public class NOperario implements Incurridor,NTrabajador {
    @Override
    public void incurre() {
        System.out.println("incurre Operario ");
    }

    @Override
    public void trabaja() {
        System.out.println("trabaja Operario ");
    }
}
