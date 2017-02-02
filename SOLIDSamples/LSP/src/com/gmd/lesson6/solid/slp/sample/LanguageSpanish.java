package com.gmd.lesson6.solid.slp.sample;

/**
 * Created by em on 18/07/16.
 */
public class LanguageSpanish implements Person {
    @Override
    public void greet() {
        System.out.println("¡Hola!");
    }

    @Override
    public String getMessage() {
        return "¡Hola!";
    }

    public String getMessageES(){
        return "¡Hola!";
    }
}
