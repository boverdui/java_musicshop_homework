public class FrenchHorn extends Instrument implements IPlay, ISell {

    private String brand;
    private String key;

    public FrenchHorn(Type type, String brand, String key, double buyingPrice, double sellingPrice) {
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
        return "Horn horn horn ...";
    }

    public double calculateMarkup() {
        return getSellingPrice() - getBuyingPrice();
    }

}
