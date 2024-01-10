package org.dhiawebdev.exercices.chapter1.encapsulation;

import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        // Set up Ricks guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec("Stratocastor", Builder.FENDER, Type.ELECTRIC, Wood.ALDER,
                Wood.ALDER, 6);
        List<Guitar> guitars = inventory.search(whatErinLikes);
        if (!guitars.isEmpty()) {
            System.out.println("Erin you might like these guitars");
            for (Guitar guitar : guitars) {
                GuitarSpec guitarSpec = guitar.getGuitarSpec();
                System.out.println("We have a " +
                        guitarSpec.getBuilder() + " " + guitarSpec.getModel() + " " +
                        guitarSpec.getType() + " guitar:\n  " +
                        guitarSpec.getBackWood() + " back and sides,\n  " +
                        guitarSpec.getTopWood() + " top.\nYou can have it for only $" +
                        guitar.getPrice() + "!");
                System.out.println("---");
            }
        } else {
            System.out.println("Sorry, Erin we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {

        GuitarSpec fenderSpec = new GuitarSpec("Stratocastor", Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER,
                6);

        inventory.addGuitar("V95693", 1499.95, fenderSpec);
        inventory.addGuitar("V9512", 1549.95, fenderSpec);
    }
}
