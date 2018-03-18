import Items.Instruments.FrenchHorn;
import Items.Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrenchHornTest {

    FrenchHorn frenchHorn;

    @Before
    public void before() {
        frenchHorn = new FrenchHorn(Type.BRASS,"Alexander", "Bb/F", 4500.00, 5500.00);
    }

    @Test
    public void hasType() {
        assertEquals(Type.BRASS, frenchHorn.getType());
    }

    @Test
    public void hasBrand() {
        assertEquals("Alexander", frenchHorn.getBrand());
    }

    @Test
    public void hasKey() {
        assertEquals("Bb/F", frenchHorn.getKey());
    }

    @Test
    public void canPlay() {
        assertEquals("Horn horn horn ...", frenchHorn.play());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(4500.00, frenchHorn.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(5500.00, frenchHorn.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(1000.00, frenchHorn.calculateMarkup(), 0.01);
    }

}
