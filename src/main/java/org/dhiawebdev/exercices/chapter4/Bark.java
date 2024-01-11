package org.dhiawebdev.exercices.chapter4;

class Bark {
    private String sound;

    public Bark(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return this.sound;
    }

    public boolean equales(Object obj) {
        if (obj instanceof Bark) {
            Bark otherBark = (Bark) obj;
            if (this.sound.equalsIgnoreCase(otherBark.sound)) {
                return true;
            }

        }

        return false;
    }
}