package org.lasencinas.item.bebida;

import org.lasencinas.item.Item;
import org.lasencinas.packing.Packing;
import org.lasencinas.packing.objetos.Tubo;

public abstract class Bebida implements Item {

    /* ---- PROPERTIES OF THE CLASS ---- */
    private Tubo tubo = null;

    /* ---- MAIN BEHAVIOURS ---- */
    @Override
    public abstract Packing empaquetado();


    /* ---- TO STRING ---- */
    @Override
    public String toString() {
        return "Bebida{" +
                "tubo: " + tubo +
                '}';
    }
}
