package org.lasencinas.item.cereales.subtipos;

import org.lasencinas.item.cereales.Cereales;
import org.lasencinas.packing.Packing;
import org.lasencinas.packing.objetos.Caja;

public class Eyeholes extends Cereales {

    /* ---- PROPERTIRES ---- */
    private Packing caja = null;
    private float precio = 25;

    /* ---- CONSTRUCTOR ---- */
    public Eyeholes() {

    }
    public Eyeholes(Packing caja) {
        this.caja = new Caja("Eyeholes");
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
