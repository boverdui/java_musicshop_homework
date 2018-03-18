import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {

    Cello cello;

    @Before
    public void before() {
        cello = new Cello(Type.STRING, "Stradivarius", 100000.00, 125000.00);
    }

    @Test
    public void hasType() {
        assertEquals(Type.STRING, cello.getType());
    }

    @Test
    public void hasBuilder() {
        assertEquals("Stradivarius", cello.getBuilder());
    }

    @Test
    public void canPlay() {
        assertEquals("Cello cello cello ...", cello.play());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(100000.00, cello.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(125000.00, cello.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(25000.00, cello.calculateMarkup(), 0.01);
    }

}
