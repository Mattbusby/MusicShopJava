package Items4sale;

import behaviours.ISell;

public class GuitarString extends Item implements ISell {
    public GuitarString(String description, double boughtFor, double sellingFor) {
        super(description, boughtFor, sellingFor);
    }

    @Override
    public double calculateMarkup() {
        return getSellingFor()-getBoughtFor();
    }
}
