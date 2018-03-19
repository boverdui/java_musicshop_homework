import Items.Instruments.Cello;
import Items.Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {

    Cello cello;

    @Before
    public void before() {
        cello = new Cello(Type.STRING, "A description of this item","Aitchison", 22000.00, 25000.00);
    }

    @Test
    public void hasType() {
        assertEquals(Type.STRING, cello.getType());
    }

    @Test
    public void hasDescription() {
        assertEquals("A description of this item", cello.getDescription());
    }

    @Test
    public void hasBuilder() {
        assertEquals("Aitchison", cello.getBuilder());
    }

    @Test
    public void canPlay() {
        assertEquals("The sound of the cello ...", cello.play());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(22000.00, cello.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(25000.00, cello.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(3000.00, cello.calculateMarkup(), 0.01);
    }

}
