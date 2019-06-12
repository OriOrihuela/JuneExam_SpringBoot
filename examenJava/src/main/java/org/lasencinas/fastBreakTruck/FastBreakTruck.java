package org.lasencinas.fastBreakTruck;

import org.lasencinas.desayuno.Desayuno;
import org.lasencinas.item.bebida.subtipos.FleebJuice;
import org.lasencinas.item.bebida.subtipos.TurbulentJuice;
import org.lasencinas.item.cereales.subtipos.Eyeholes;
import org.lasencinas.item.cereales.subtipos.Smiggles;

public class FastBreakTruck {

    /* ---- PROPERTIES OF THE CLASS ---- */
    private Desayuno desayuno = null;


    /* ---- GETTERS ---- */
    public Desayuno getDesayuno() {
        return desayuno;
    }


    /* ---- SETTERS ---- */
    public void setDesayuno(Desayuno desayuno) {
        this.desayuno = desayuno;
    }

    /* ---- CONSTRUCTORS ---- */
    public FastBreakTruck() {
    }


    /* ---- MAIN BEHAVIOURS ---- */
    public static Desayuno prepararEyeHoles() {
        return null;
    }

    public static Desayuno prepararSmiggles() {
        return null;
    }
}
