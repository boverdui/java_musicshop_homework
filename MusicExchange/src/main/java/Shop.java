import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public void addToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeFromStock(ISell item) {
        this.stock.remove(item);
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public double calculateMaxProfit() {
        double maxProfit = 0.00;
        for (ISell item: stock) {
            maxProfit += item.calculateMarkup();
        }
        return maxProfit;
    }

}
