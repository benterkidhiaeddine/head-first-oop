package org.dhiawebdev.exercices.chapter2.remote;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private int closingDelay;
    private boolean open;

    public DogDoor() {
        this.open = false;
    }

    public void setClosingDelay(int delay) {
        this.closingDelay = delay;
    }

    public void open() {
        System.out.println("The dog door opens");
        this.open = true;
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                close();
                timer.cancel();
            }
        }, closingDelay);

    }

    public void close() {

        System.out.println("The dog door closes");
        this.open = false;
    }

    public boolean isOpen() {
        return this.open;
    }
}
