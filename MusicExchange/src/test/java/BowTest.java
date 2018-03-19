import Items.Other.Bow;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowTest {

    Bow bow;

    @Before
    public void before() {
        bow = new Bow("A description of this item", "Alfons Riedl", 1250.00, 1500.00);
    }

    @Test
    public void hasDescription() {
        assertEquals("A description of this item", bow.getDescription());
    }

    @Test
    public void hasMaker() {
        assertEquals("Alfons Riedl", bow.getMaker());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(1250.00, bow.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(1500.00, bow.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(250.00, bow.calculateMarkup(), 0.01);
    }

}
