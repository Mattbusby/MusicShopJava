package Instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Piano extends Instrument implements IPlay, ISell {
    public Piano(String material, String colour, InstrumentType type, double boughtFor, double sellingFor) {
        super(material, colour, type, boughtFor, sellingFor);
    }

    @Override
    public String play() {
        return "Fur Elise";
    }

    @Override
    public double calculateMarkup() {
        return getSellingFor()-getBoughtFor();
    }
}
