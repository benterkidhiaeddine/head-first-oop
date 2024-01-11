package org.dhiawebdev.exercices.chapter4;

import java.util.Iterator;
import java.util.List;

class BarkRecongnizer {
    private DogDoor door;

    public BarkRecongnizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark) {
        System.out.println("The bark recognizer heard: a'" + bark.getSound() + "'");
        List<Bark> allowedBarks = door.getAllowedBarks();
        for (Iterator i = allowedBarks.iterator(); i.hasNext();) {
            Bark allowedBark = (Bark) i.next();
            if (allowedBark.equales(bark)) {
                door.open();
                return;

            }

        }
        System.out.println("The bark sound is not allowed the door will stay closed");
    }
}