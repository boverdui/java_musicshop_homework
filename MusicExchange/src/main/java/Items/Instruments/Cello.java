package Items.Instruments;

import Behaviours.IPlay;

public class Cello extends Instrument implements IPlay {

    private String builder;

    public Cello(Type type, String description, String builder, double buyingPrice, double sellingPrice) {
        super(type, description, buyingPrice, sellingPrice);
        this.builder = builder;
    }

    public String getBuilder() {
        return this.builder;
    }

    public String play() {
        return "The sound of the cello ...";
    }

}
