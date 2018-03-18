import com.sun.javaws.jnl.InstallerDesc;

public abstract class Instrument {

    private Type type;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(Type type, double buyingPrice, double sellingPrice) {
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public Type getType() {
        return this.type;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

}
