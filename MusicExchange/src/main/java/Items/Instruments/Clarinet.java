package Items.Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Clarinet extends Instrument implements IPlay {

    private String brand;
    private String key;

    public Clarinet(Type type, String brand, String key, double buyingPrice, double sellingPrice) {
        super(type, buyingPrice, sellingPrice);
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
        return "Clarinet clarinet clarinet ...";
    }

}
