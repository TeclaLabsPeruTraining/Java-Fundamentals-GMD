package com.gmd.lesson6.solid.slp;

import com.gmd.lesson6.solid.slp.sample.LanguageEnglish;
import com.gmd.lesson6.solid.slp.sample.LanguagePortuguese;
import com.gmd.lesson6.solid.slp.sample.LanguageSpanish;

/**
 * Created by em on 18/07/16.
 */
public class Main {

    public static void main(String[] args) {
        final LanguageSpanish personES = new LanguageSpanish();
        final LanguagePortuguese personPT = new LanguagePortuguese();
        final LanguageEnglish personEN = new LanguageEnglish();

        Welcome welcome= new Welcome();
        welcome.weltomeTo(personEN);

    }
}
