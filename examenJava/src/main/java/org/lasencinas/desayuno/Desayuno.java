package org.lasencinas.desayuno;

import org.lasencinas.item.Item;

import java.util.Set;

public class Desayuno {

    /* ---- PROPERTIES ---- */
    private Set<Item> items = null;
    private double totalPrice = 0d;


    /* ---- GETTERs ---- */
    public Set<Item> getItems() {
        return items;
    }


    /* ---- SETTERS ---- */
    public void setItems(Set<Item> items) {
        this.items = items;
    }

    /* ---- CONSTRUCTOR ---- */
    public Desayuno() {
    }


    /* ---- MAIN BEHAVIOURS ---- */
    public void mostrarItems() {

        for (Item item :
                getItems()) {
            System.out.println(item);
        }

    }

    public Float getCoste() {
        float price = 0;
        for (Item item :
                getItems()) {
            //getItems()
        }
        return null;
    }
}
