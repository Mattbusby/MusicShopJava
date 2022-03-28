package Items4sale;

import behaviours.ISell;

public class SheetMusic extends Item implements ISell {
    public SheetMusic(String description, double boughtFor, double sellingFor) {
        super(description, boughtFor, sellingFor);
    }

    @Override
    public double calculateMarkup() {
        return getSellingFor()-getBoughtFor();
    }
}
