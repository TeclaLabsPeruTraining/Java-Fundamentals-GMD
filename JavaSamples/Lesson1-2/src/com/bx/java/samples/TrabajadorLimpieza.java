package com.bx.java.samples;

/**
 * Created by pjohnson on 4/01/17.
 */

public class TrabajadorLimpieza extends Trabajador {

    private String area;

    public TrabajadorLimpieza(String nombre) {
        super(nombre);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String trabajar() {
        return "Estoy limpiando!!";
    }
}
