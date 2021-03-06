package Items.Other;

import Items.Item;

public class SheetMusic extends Item {

    private String title;
    private String composer;

    public SheetMusic(String description, String title, String composer, double buyingPrice, double sellingPrice) {
        super(description, buyingPrice, sellingPrice);
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
