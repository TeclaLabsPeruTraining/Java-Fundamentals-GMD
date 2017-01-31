package com.bx.java.samples;

/**
 * Created by pjohnson on 4/01/17.
 */

public abstract class Trabajador extends Persona {

    private String id;
    private String nombreJefe;

    public Trabajador(String nombre) {
        super(nombre);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreJefe() {
        return nombreJefe;
    }

    public void setNombreJefe(String nombreJefe) {
        this.nombreJefe = nombreJefe;
    }

    public abstract String trabajar();
}
