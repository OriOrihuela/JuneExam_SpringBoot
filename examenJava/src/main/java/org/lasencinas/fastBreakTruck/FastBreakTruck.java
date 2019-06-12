package org.lasencinas.fastBreakTruck;

import org.lasencinas.desayuno.Desayuno;
import org.lasencinas.item.Item;
import org.lasencinas.item.bebida.Bebida;
import org.lasencinas.item.bebida.subtipos.FleebJuice;
import org.lasencinas.item.bebida.subtipos.TurbulentJuice;
import org.lasencinas.item.cereales.Cereales;
import org.lasencinas.item.cereales.subtipos.Eyeholes;
import org.lasencinas.item.cereales.subtipos.Smiggles;
import org.lasencinas.packing.Packing;
import org.lasencinas.packing.objetos.Caja;
import org.lasencinas.packing.objetos.Tubo;

import java.util.HashSet;
import java.util.Set;

public class FastBreakTruck {

    /* ---- MAIN BEHAVIOURS ---- */
    public static Desayuno prepararEyeHoles() {
        Cereales eyeHoles = new Eyeholes(new Caja());
        Bebida turbulentJuice = new TurbulentJuice(new Tubo());
        Set<Item> items = new HashSet<>();
        items.add(eyeHoles);
        items.add(turbulentJuice);
        Desayuno desayuno = new Desayuno(items);
        return desayuno;
    }

    public static Desayuno prepararSmiggles() {
        Cereales smiggles = new Smiggles(new Caja());
        Bebida fleebJuice = new FleebJuice(new Tubo());
        Set<Item> items = new HashSet<>();
        items.add(smiggles);
        items.add(fleebJuice);
        Desayuno desayuno = new Desayuno(items);
        return desayuno;
    }
}
