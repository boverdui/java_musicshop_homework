package Items.Instruments;

import Behaviours.IPlay;

public class Clarinet extends Instrument implements IPlay {

    private String brand;
    private String key;

    public Clarinet(Type type, String description, String brand, String key, double buyingPrice, double sellingPrice) {
        super(type, description, buyingPrice, sellingPrice);
        this.brand = brand;
        this.key = key;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getKey() {
        return this.key;
    }

    public String play() {
        return "The sound of the clarinet ...";
    }

}
