package Items4sale;

public abstract class Item {

    private String description;
    private double boughtFor;
    private double sellingFor;

    public Item(String description, double boughtFor, double sellingFor) {
        this.description = description;
        this.boughtFor = boughtFor;
        this.sellingFor = sellingFor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
