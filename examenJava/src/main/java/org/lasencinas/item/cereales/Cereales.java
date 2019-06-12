package org.lasencinas.item.cereales;

import org.lasencinas.item.Item;
import org.lasencinas.packing.Packing;

public abstract class Cereales implements Item {

    /* ---- PROPERTIES OF THE CLASS ---- */
    private Packing caja = null;

    /* ---- MAIN BEHAVIOURS ---- */
    public abstract Packing empaquetado();

    @Override
    public String toString() {
        return "Cereales{" +
                "caja: " + caja +
                '}';
    }
}
