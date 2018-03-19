import Items.Instruments.*;
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
    Viola viola;
    Bow bow;
    SheetMusic sheetMusic;

    @Before
    public void before() {
        shop = new Shop();
        cello = new Cello(Type.STRING, "A description of this item","Aitchison", 22000.00, 25000.00);
        clarinet = new Clarinet(Type.WOODWIND, "A description of this item","Wurlitzer", "Bb", 4000.00, 5000.00);
        frenchHorn = new FrenchHorn(Type.BRASS,"A description of this item","Alexander", "Bb/F", 4500.00, 5500.00);
        viola = new Viola(Type.STRING, "A description of this item","Junemann", 10000.00, 12500.00);bow = new Bow("A description of this item bow", "Alfons Riedl", 1250.00, 1500.00);
        sheetMusic = new SheetMusic("A description of this item","Cello Suites", "Bach", 5.00, 10.00);
    }

    @Test
    public void canAddItemToStock() {
        shop.addItemToStock(cello);
        assertEquals(Arrays.asList(cello), shop.getStock());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItemToStock(cello);
        shop.addItemToStock(clarinet);
        shop.removeItemFromStock(cello);
        assertEquals(Arrays.asList(clarinet), shop.getStock());
    }

    @Test
    public void canCalculateMaxProfit() {
        shop.addItemToStock(cello);
        shop.addItemToStock(clarinet);
        shop.addItemToStock(frenchHorn);
        shop.addItemToStock(viola);
        shop.addItemToStock(bow);
        shop.addItemToStock(sheetMusic);
        assertEquals(7755.00, shop.calculateMaxProfit(), 0.01);
    }

}
