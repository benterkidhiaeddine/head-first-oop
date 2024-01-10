package org.dhiawebdev.exercices.chapter1.choices;

public class Guitar {
    private String serialNumber, model;
    private Builder builder;
    private Wood backWood, topWood;
    private Type type;
    private double price;

    public Guitar(String serialNumber, double price, Builder builder, String model, Type type,
            Wood backWood, Wood topWood) {
        this.serialNumber = serialNumber;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    // method to Compare guitar specs
    public boolean hasSameSpecification(Guitar comparedGuitar) {

        if (comparedGuitar.getBuilder() != this.getBuilder()) {
            return false;
        }
        String model = comparedGuitar.getModel();
        if ((model != null) && (!model.equals("")) && (!model.equalsIgnoreCase(this.getModel()))) {
            return false;
        }
        if (comparedGuitar.getType() != this.getType()) {
            return false;
        }
        if (comparedGuitar.getBackWood() != this.getBackWood()) {
            return false;
        }
        if (comparedGuitar.getTopWood() != this.getTopWood()) {
            return false;
        }

        return true;
    }
}
