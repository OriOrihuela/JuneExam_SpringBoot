package org.lasencinas.desayuno;

import org.lasencinas.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Desayuno {

    /* ---- PROPERTIES ---- */
    private List<Item> items = new ArrayList<>();


    /* ---- GETTERs ---- */
    public List<Item> getItems() {
        return items;
    }


    /* ---- SETTERS ---- */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /* ---- CONSTRUCTOR ---- */
    public Desayuno() {
    }


    /* ---- MAIN BEHAVIOURS ---- */
    public void mostrarItems() {

    }

    public Float getCoste() {
        return null;
    }
}
