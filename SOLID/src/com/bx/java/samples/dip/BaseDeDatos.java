package com.bx.java.samples.dip;

/**
 * Created by pjohnson on 9/01/17.
 */
public class BaseDeDatos implements Persistencia {

    @Override
    public void guardar(Compra compra) {
        //Esta clase deberia guardar en la BD local del device.
    }
}
