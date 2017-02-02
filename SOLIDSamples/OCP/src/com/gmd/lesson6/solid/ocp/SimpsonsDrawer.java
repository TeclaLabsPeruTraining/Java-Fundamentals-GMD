package com.gmd.lesson6.solid.ocp;

import com.gmd.lesson6.solid.ocp.model.*;

/**
 * Created by em on 18/07/16.
 */
public class SimpsonsDrawer {

    public void draw (Homer homer){
        System.out.println("Home Simpson draw");
    }

    public void draw(Object[] simpsons){

        for (Object simpson : simpsons )
        {
            if(simpson instanceof Homer){
                System.out.println("Homer Simpson");

            }else if(simpson instanceof Marge){

                System.out.println("Marge Simpson");
            }else if(simpson instanceof Bart){
                System.out.println("Bart Simpson");
            }else if(simpson instanceof Lisa){
                System.out.println("Lisa Simpson");
            }else if(simpson instanceof Maggie){
                System.out.println("Maggie Simpson");
            }else{
                System.out.println("Other Simpson");
            }
        }
    }
}
