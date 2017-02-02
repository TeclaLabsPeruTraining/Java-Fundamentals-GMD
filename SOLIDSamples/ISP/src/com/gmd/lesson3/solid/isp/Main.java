package com.gmd.lesson3.solid.isp;

/**
 * Created by emedinaa on 18/07/16.
 */
public class Main {

    public static void main(String[] args) {

        Trabajador encargado = new Encargado();
        Trabajador operario = new Operario();

        encargado.trabaja();
        operario.trabaja();
    }
}
