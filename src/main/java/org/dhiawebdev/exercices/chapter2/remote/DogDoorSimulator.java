package org.dhiawebdev.exercices.chapter2.remote;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoorSimulator {

    public static void main(String[] args) {
        // mainPath();

        // fidoTakesHisTime();

        barkRecognizerPath();
    }

    private static void mainPath() {

        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Fido wants to go outside");
        remote.pressButton();
        System.out.println("Fido is outside");
        System.out.println("Fido is all done");
        System.out.println("Fido is in the house");
    }

    private static void fidoTakesHisTime() {

        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Fido wants to go outside");
        System.out.println("Gina grabs and presses the remote...");
        remote.pressButton();
        System.out.println("Fido goes outside");
        System.out.println("Fido hangs about and takes his time");
        try {
            Thread.currentThread().sleep(10000);

        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("Fido is all done");
        System.out.println("Fido want to come inside");
        remote.pressButton();
        System.out.println("Fido is inside");

    }

    private static void barkRecognizerPath() {

        DogDoor door = new DogDoor();
        BarkRecongnizer barkRecongnizer = new BarkRecongnizer(door);
        Remote remote = new Remote(door);

        System.out.println("Fido starts barking");
        barkRecongnizer.recognize("Woof");

        System.out.println("Fido has gone outisde");
        System.out.println("Fido is all done");

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("But he is stuck outside");
        System.out.println("Fido starts barking");

        barkRecongnizer.recognize("Woof");
        System.out.println("Fido is back inside");
    }
}
