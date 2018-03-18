package Items.Instruments;

import Items.Item;

public abstract class Instrument extends Item {

    private Type type;

    public Instrument(Type type, double buyingPrice, double sellingPrice) {
        super(buyingPrice, sellingPrice);
        this.type = type;
    }

    public Type getType() {
        return this.type;
    }

}
