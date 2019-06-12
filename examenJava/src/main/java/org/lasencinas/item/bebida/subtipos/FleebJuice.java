package org.lasencinas.item.bebida.subtipos;

import org.lasencinas.item.bebida.Bebida;
import org.lasencinas.packing.Packing;
import org.lasencinas.packing.objetos.Tubo;

public class FleebJuice extends Bebida {

    /* ---- PROPERTIES ---- */
    private Packing tubo = null;
    private float precio = 35;

    /* ---- CONSTRUCTORS ---- */
    public FleebJuice(Packing tubo) {
        this.tubo = new Tubo("FleebJuice");
    }


    /* ---- MAIN BEHAVIORUS ---- */
    @Override
    public String nombre() {
        return tubo.envoltorio();
    }

    @Override
    public Packing empaquetado() {
        return tubo;
    }

    @Override
    public Float pvp() {
        return precio;
    }

    @Override
    public String toString() {
        return "Item: " + nombre() +
                ", Empaquetado: " + empaquetado() +
                ", precio=" + pvp()  + super.toString();
    }
}
