import Items.Instruments.Clarinet;
import Items.Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {

    Clarinet clarinet;

    @Before
    public void before() {
        clarinet = new Clarinet(Type.WOODWIND, "Wurlitzer", "Bb", 4000.00, 5000.00);
    }

    @Test
    public void hasType() {
        assertEquals(Type.WOODWIND, clarinet.getType());
    }

    @Test
    public void hasBrand() {
        assertEquals("Wurlitzer", clarinet.getBrand());
    }

    @Test
    public void hasKey() {
        assertEquals("Bb", clarinet.getKey());
    }

    @Test
    public void canPlay() {
        assertEquals("Clarinet clarinet clarinet ...", clarinet.play());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(4000.00, clarinet.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(5000.00, clarinet.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(1000.00, clarinet.calculateMarkup(), 0.01);
    }

}
