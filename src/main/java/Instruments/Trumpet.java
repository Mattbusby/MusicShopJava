package Instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Trumpet extends Instrument implements IPlay, ISell {
    public Trumpet(String material, String colour, InstrumentType type, double boughtFor, double sellingFor) {
        super(material, colour, type, boughtFor, sellingFor);
    }

    @Override
    public String play() {
        return "All you need is love";
    }

    @Override
    public double calculateMarkup() {
        return getSellingFor()-getBoughtFor();
    }
}
