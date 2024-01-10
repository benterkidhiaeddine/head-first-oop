package org.dhiawebdev.exercices.chapter1.encapsulation;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;

    public Inventory() {
        this.guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
        this.guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator<?> i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }

        return null;
    }

    public List<Guitar> search(GuitarSpec searchGuitar) {
        List<Guitar> foundGuitars = new LinkedList<Guitar>();
        for (Iterator<?> i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            if (!guitar.hasSameSpecification(searchGuitar)) {
                continue;
            }

            foundGuitars.add(guitar);
        }

        return foundGuitars;

    }

}
