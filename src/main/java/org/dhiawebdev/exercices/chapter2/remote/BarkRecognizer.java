package org.dhiawebdev.exercices.chapter2.remote;

class BarkRecongnizer {
    private DogDoor door;

    public BarkRecongnizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(String bark) {
        if (!door.isOpen()) {
            System.out.println("The bark recognizer heard: a'" + bark + "'");
            door.open();
        }
    }
}