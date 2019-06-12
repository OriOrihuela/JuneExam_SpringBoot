package org.lasencinas.item.bebida;

import org.lasencinas.item.Item;
import org.lasencinas.packing.Packing;

public abstract class Bebida implements Item {

    /* ---- MAIN BEHAVIOURS ---- */
    @Override
    public abstract Packing empaquetado();


    /* ---- TO STRING ---- */
    @Override
    public String toString() {
        return "";
    }
}
