package org.lasencinas.item.cereales;

import org.lasencinas.item.Item;
import org.lasencinas.packing.Packing;

public abstract class Cereales implements Item {

    /* ---- MAIN BEHAVIOURS ---- */
    public abstract Packing empaquetado();

    @Override
    public String toString() {
        return "Cereales{}";
    }
}
