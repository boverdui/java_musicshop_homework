package Items.Instruments;

import Behaviours.IPlay;

public class Cello extends Instrument implements IPlay {

    private String builder;

    public Cello(Type type, String builder, double buyingPrice, double sellingPrice) {
        super(type, buyingPrice, sellingPrice);
        this.builder = builder;
    }

    public String getBuilder() {
        return this.builder;
    }

    public String play() {
        return "Items.Instruments.Cello cello cello ...";
    }

}
