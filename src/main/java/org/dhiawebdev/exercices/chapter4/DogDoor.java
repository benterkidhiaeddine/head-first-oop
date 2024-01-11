package org.dhiawebdev.exercices.chapter4;

import java.util.Timer;
import java.util.TimerTask;
import java.util.LinkedList;
import java.util.List;

public class DogDoor {
    private List<Bark> allowedBarks;
    private int closingDelay;
    private boolean open;

    public DogDoor() {
        this.open = false;
        this.allowedBarks = new LinkedList<Bark>();
    }

    public void setClosingDelay(int delay) {
        this.closingDelay = delay;
    }

    public List<Bark> getAllowedBarks() {
        return this.allowedBarks;
    }

    public void addAllowedBark(Bark bark) {
        this.allowedBarks.add(bark);
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
