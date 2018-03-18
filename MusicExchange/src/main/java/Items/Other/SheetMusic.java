package Items.Other;

import Behaviours.ISell;
import Items.Item;

public class SheetMusic extends Item implements ISell {

    private String title;
    private String composer;

    public SheetMusic(String title, String composer, double buyingPrice, double sellingPrice) {
        super(buyingPrice, sellingPrice);
        this.title = title;
        this.composer = composer;
    }

    public String getTitle() {
        return this.title;
    }

    public String getComposer() {
        return this.composer;
    }

}
