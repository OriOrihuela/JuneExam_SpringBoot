package org.lasencinas.item.toy.subtipos;

import org.lasencinas.item.toy.Toy;
import org.lasencinas.packing.Packing;
import org.lasencinas.packing.objetos.Caja;

public class Plumbus extends Toy {

    /* ---- PROPERTIES ---- */
    private Packing caja = null;
    private float precio = 100;

    /* ---- CONSTRUCTORS ---- */
    public Plumbus() {
    }

    public Plumbus(Packing caja) {
        this.caja = new Caja("Plumbus");
    }

    /* ---- MAIN BEHAVIOURS ---- */
    @Override
    public String nombre() {
        return caja.envoltorio();
    }

    @Override
    public Packing empaquetado() {
        return caja;
    }

    @Override
    public Float pvp() {
        return precio;
    }

    @Override
    public String toString() {
        return "Item: " + nombre() +
                ", Empaquetado: " + empaquetado() +
                ", precio = " + pvp() + super.toString();
    }
}
