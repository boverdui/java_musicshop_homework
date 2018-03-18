package Items;

import Behaviours.ISell;

public abstract class Item implements ISell {
    private double buyingPrice;
    private double sellingPrice;

    public Item (double buyingPrice, double sellingPrice) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public double calculateMarkup() {
        return getSellingPrice() - getBuyingPrice();
    }

}
