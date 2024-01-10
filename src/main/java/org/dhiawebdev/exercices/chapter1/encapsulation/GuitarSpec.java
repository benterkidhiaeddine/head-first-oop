package org.dhiawebdev.exercices.chapter1.encapsulation;

public class GuitarSpec {
    private String model;
    private Builder builder;
    private Wood backWood, topWood;
    private Type type;
    private int numStrings;

    public GuitarSpec(String model, Builder builder, Type type, Wood backWood, Wood topWood, int numStrings) {
        this.model = model;
        this.builder = builder;
        this.backWood = backWood;
        this.topWood = topWood;
        this.type = type;
        this.numStrings = numStrings;
    }

    public String getModel() {
        return model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public Type getType() {
        return type;
    }

    public int getNumStrings() {
        return this.numStrings;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + ((builder == null) ? 0 : builder.hashCode());
        result = prime * result + ((backWood == null) ? 0 : backWood.hashCode());
        result = prime * result + ((topWood == null) ? 0 : topWood.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GuitarSpec other = (GuitarSpec) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (builder != other.builder)
            return false;
        if (backWood != other.backWood)
            return false;
        if (topWood != other.topWood)
            return false;
        if (type != other.type)
            return false;
        return true;
    }

}
