package com.gmd.lesson6.solid.srp.sample2;

/**
 * Created by emedinaa on 18/07/16.
 */
public interface Modem {

    void dial(String phoneNumber);
    void hangup();

    void send(char c);
    char recv();
}
