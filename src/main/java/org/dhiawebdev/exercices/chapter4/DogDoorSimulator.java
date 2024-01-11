package org.dhiawebdev.exercices.chapter4;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoorSimulator {

    public static void main(String[] args) {
        mainPath();

    }

    private static void mainPath() {
        DogDoor door = new DogDoor();
        door.addAllowedBark(new Bark("rwolf"));
        door.addAllowedBark(new Bark("rooowlf"));
        door.addAllowedBark(new Bark("rwalf"));
        door.addAllowedBark(new Bark("woof"));

        BarkRecongnizer recognizer = new BarkRecongnizer(door);
        Remote remote = new Remote(door);

        // Simulate the hardware hearing a bark
        System.out.println("Bruce starts barking");
        recognizer.recognize(new Bark("rwolf"));
        System.out.println("\nBruce has gone outside ");

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {

            System.out.println("Programme interrupted");
        }

        System.out.println("Bruce all done");
        System.out.println("But he is stuck outside ...");

        // Simulate the hardware hearing a bark (Not Bruce)
        Bark smallDogBark = new Bark("yip");
        System.out.println("A small dog starts barking");
        recognizer.recognize(smallDogBark);

        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {

            System.out.println("Programme interrupted");
        }
        // Simulate the hardware hearing a bark (Bruce again)
        System.out.println("Bruce starts barking");
        recognizer.recognize(new Bark("rwolf"));
        System.out.println("\nBruce is back inside ");

    }

}
