package Items.Other;

import Behaviours.ISell;
import Items.Item;

public class Bow extends Item implements ISell {

    private String description;
    private String maker;

    public Bow(String description, String maker, double buyingPrice, double sellingPrice) {
        super(buyingPrice, sellingPrice);
        this.description = description;
        this.maker = maker;
    }

    public String getDescription() {
        return this.description;
    }

    public String getMaker() {
        return this.maker;
    }

}
