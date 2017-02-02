package com.gmd.lesson6.solid.slp.sample;

/**
 * Created by em on 18/07/16.
 */
public
class LanguageEnglish implements Person {
    @Override
    public void greet() {
        System.out.println("¡Hello!");
    }

    @Override
    public String getMessage() {
        return "¡Hello!";
    }
}
