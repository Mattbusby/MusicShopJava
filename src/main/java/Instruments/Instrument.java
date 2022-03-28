package Instruments;

public abstract class Instrument {

    private String material;
    private String colour;
    private InstrumentType type;
    private double boughtFor;
    private double sellingFor;

    public Instrument(String material, String colour, InstrumentType type, double boughtFor, double sellingFor) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.boughtFor = boughtFor;
        this.sellingFor = sellingFor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public double getBoughtFor() {
        return boughtFor;
    }

    public void setBoughtFor(double boughtFor) {
        this.boughtFor = boughtFor;
    }

    public double getSellingFor() {
        return sellingFor;
    }

    public void setSellingFor(double sellingFor) {
        this.sellingFor = sellingFor;
    }
}
