package com.gmd.lesson6.solid.srp.sample2;

/**
 * Created by emedinaa on 18/07/16.
 */
public class MyModem implements Connection, DataChannel {
    @Override
    public void dial(String phoneNumber) {
        System.out.println(String.format("Modem dial %s ",phoneNumber));
    }

    @Override
    public void hangup() {
        System.out.println("Modem hanup");
    }

    @Override
    public void send(char c) {
        System.out.println(String.format("Modem send %s",c));
    }

    @Override
    public char recv() {
        return 0;
    }
}
