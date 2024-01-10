package org.dhiawebdev.exercices.appendixb;

public class Jet extends Airplane {
    private static final int MULTIPLIER = 2;

    public Jet() {
        super();
    }

    // Overriding the super class behaviour from the subclass
    public void setSpeed(int speed) {
        super.setSpeed(speed * MULTIPLIER);
    }

    // A subclass can override it's own methods
    public void accelerate() {
        super.setSpeed(getSpeed() * 2);
    }
}