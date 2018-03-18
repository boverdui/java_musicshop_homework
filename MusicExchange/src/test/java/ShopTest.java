import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Cello cello;
    Clarinet clarinet;
    FrenchHorn frenchHorn;
    SheetMusic sheetMusic;

    @Before
    public void before() {
        shop = new Shop();
        cello = new Cello(Type.STRING, "Stradivarius", 100000.00, 125000.00);
        clarinet = new Clarinet(Type.WOODWIND, "Wurlizer", "Bb", 5000.00, 6000.00);
        frenchHorn = new FrenchHorn(Type.BRASS,"Alexander", "F", 4000.00, 5000.00);
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
        shop.addToStock(sheetMusic);
        assertEquals(27005.00, shop.calculateMaxProfit(), 0.01);
    }

}
