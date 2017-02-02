package com.gmd.lesson6.solid.slp;

import com.gmd.lesson6.solid.slp.sample.LanguageEnglish;
import com.gmd.lesson6.solid.slp.sample.LanguageSpanish;
import com.gmd.lesson6.solid.slp.sample.Person;

/**
 * Created by em on 19/07/16.
 */
public class MainSample {

    public static void main(String[] args) {
        final Person personES = new LanguageSpanish();
        final Person personEN = new LanguageEnglish();

        Welcome welcome= new Welcome();
        welcome.weltomeTo(personES);
        //welcome.weltomeTo(personEN);
    }
}
