public class SheetMusic implements ISell {

    private String title;
    private String composer;
    private double buyingPrice;
    private double sellingPrice;

    public SheetMusic(String title, String composer, double buyingPrice, double sellingPrice) {
        this.title = title;
        this.composer = composer;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getTitle() {
        return this.title;
    }

    public String getComposer() {
        return this.composer;
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
