package Items.Other;

import Items.Item;

public class Bow extends Item {

    private String maker;

    public Bow(String description, String maker, double buyingPrice, double sellingPrice) {
        super(description, buyingPrice, sellingPrice);
        this.maker = maker;
    }

    public String getMaker() {
        return this.maker;
    }

}
