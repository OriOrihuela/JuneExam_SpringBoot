package org.lasencinas.desayuno;

import org.lasencinas.item.Item;

import java.util.Set;

public class Desayuno {

    /* ---- PROPERTIES ---- */
    private Set<Item> items = null;
    private float totalPrice = 0;


    /* ---- CONSTRUCTORS ---- */
    public Desayuno() {
    }

    public Desayuno(Set<Item> items) {
        this.items = items;
    }


    /* ---- GETTERS ---- */
    public Set<Item> getItems() {
        return items;
    }


    /* ---- SETTERS ---- */
    public void setItems(Set<Item> items) {
        this.items = items;
    }


    /* ---- MAIN BEHAVIOURS ---- */
    public void mostrarItems() {
        for (Item item :
                getItems()) {
            System.out.println(item);
        }
    }

    public Float getCoste() {
        for (Item item :
                getItems()) {
            this.totalPrice += item.pvp();

        }
        return this.totalPrice;
    }
}
