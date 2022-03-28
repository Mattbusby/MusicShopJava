package Instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Cowbell extends Instrument implements IPlay, ISell {
    public Cowbell(String material, String colour, InstrumentType type, double boughtFor, double sellingFor) {
        super(material, colour, type, boughtFor, sellingFor);
    }

    @Override
    public String play() {
        return "The Reaper";
    }

    @Override
    public double calculateMarkup() {
        return getSellingFor()-getBoughtFor();
    }
}
