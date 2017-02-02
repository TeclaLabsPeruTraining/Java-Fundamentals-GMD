package com.gmd.lesson3.solid.isp;

import com.gmd.lesson3.solid.isp.sample.NAutomata;
import com.gmd.lesson3.solid.isp.sample.NEncargado;
import com.gmd.lesson3.solid.isp.sample.NOperario;

/**
 * Created by emedinaa on 18/07/16.
 */
public class MainSample {

    public static void main(String[] args) {
        NEncargado nEncargado= new NEncargado();
        NOperario nOperario= new NOperario();
        NAutomata nAutomata= new NAutomata();

        nEncargado.trabaja();
        nEncargado.incurre();

        nOperario.trabaja();
        nOperario.incurre();

        nAutomata.trabaja();
    }
}
