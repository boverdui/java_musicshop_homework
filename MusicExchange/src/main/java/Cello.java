public class Cello extends Instrument implements IPlay, ISell {

    private String builder;

    public Cello(Type type, String builder, double buyingPrice, double sellingPrice) {
        super(type, buyingPrice, sellingPrice);
        this.builder = builder;
    }

    public String getBuilder() {
        return this.builder;
    }

    public String play() {
        return "Cello cello cello ...";
    }

    public double calculateMarkup() {
        return getSellingPrice() - getBuyingPrice();
    }

}
