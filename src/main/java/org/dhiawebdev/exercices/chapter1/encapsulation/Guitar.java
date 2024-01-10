package org.dhiawebdev.exercices.chapter1.encapsulation;

public class Guitar {
    private String serialNumber;
    private GuitarSpec guitarSpec;
    private double price;

    public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        this.serialNumber = serialNumber;
        this.guitarSpec = guitarSpec;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GuitarSpec getGuitarSpec() {
        return this.guitarSpec;
    }

    // method to Compare guitar specs
    public boolean hasSameSpecification(GuitarSpec comparedGuitarSpec) {

        return this.getGuitarSpec().equals(comparedGuitarSpec);

    }
}
