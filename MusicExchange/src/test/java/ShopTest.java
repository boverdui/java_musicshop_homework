import Items.Instruments.Cello;
import Items.Instruments.Clarinet;
import Items.Instruments.FrenchHorn;
import Items.Instruments.Type;
import Items.Other.Bow;
import Items.Other.SheetMusic;
import Items.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Cello cello;
    Clarinet clarinet;
    FrenchHorn frenchHorn;
    Bow bow;
    SheetMusic sheetMusic;

    @Before
    public void before() {
        shop = new Shop();
        cello = new Cello(Type.STRING, "Aitchison", 22000.00, 25000.00);
        clarinet = new Clarinet(Type.WOODWIND, "Wurlizer", "Bb", 4000.00, 5000.00);
        frenchHorn = new FrenchHorn(Type.BRASS,"Alexander", "Bb/F", 4500.00, 5500.00);
        bow = new Bow("cello bow", "Alfons Riedl", 1250.00, 1500.00);
        sheetMusic = new SheetMusic("Cello Suites", "Bach", 5.00, 10.00);
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(cello);
        assertEquals(Arrays.asList(cello), shop.getStock());
    }

    @Test
    public void canRemoveFromStock() {
        shop.addToStock(cello);
        shop.addToStock(clarinet);
        shop.removeFromStock(cello);
        assertEquals(Arrays.asList(clarinet), shop.getStock());
    }

    @Test
    public void canCalculateMaxProfit() {
        shop.addToStock(cello);
        shop.addToStock(clarinet);
        shop.addToStock(frenchHorn);
        shop.addToStock(bow);
        shop.addToStock(sheetMusic);
        assertEquals(5255.00, shop.calculateMaxProfit(), 0.01);
    }

}
