package com.gmd.lesson6.solid.slp.sample;

/**
 * Created by em on 19/07/16.
 */
public class LanguagePortuguese implements Person {

    @Override
    public void greet() {
        System.out.println("");
    }

    @Override
    public String getMessage() {
        //return "¡Olá!";
        return "";
    }

    public String getMessagePT(){
        return "¡Olá!";
    }

}
