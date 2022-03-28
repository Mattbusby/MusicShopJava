package Items4sale;

import behaviours.ISell;

public class DrumStick extends Item implements ISell {
    public DrumStick(String description, double boughtFor, double sellingFor) {
        super(description, boughtFor, sellingFor);
    }

    @Override
    public double calculateMarkup() {
        return getSellingFor()-getBoughtFor();
    }
}
