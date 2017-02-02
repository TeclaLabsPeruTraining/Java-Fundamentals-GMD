package com.gmd.lesson6.solid.ocp;

import com.gmd.lesson6.solid.ocp.carton.*;
import com.gmd.lesson6.solid.ocp.model.*;

/**
 * Created by em on 18/07/16.
 */
public class Main {

    public static void main(String[] args) {

        Object[] simpsons= new Object[]{new Homer(), new Marge(), new Bart(), new Lisa(), new Maggie()};

        SimpsonsDrawer simpsonsDrawer= new SimpsonsDrawer();
        simpsonsDrawer.draw(new Homer());

        System.out.println("---------------------");
        simpsonsDrawer.draw(simpsons);

        System.out.println("---------------------");

        Cartoon[] cartoons= new Cartoon[]{new NHomer(), new NMarge(), new NBart(), new NLisa(),new NMaggie()};

        NSimpsonsDrawer nSimpsonsDrawer= new NSimpsonsDrawer();
        nSimpsonsDrawer.draw(cartoons);
    }
}
