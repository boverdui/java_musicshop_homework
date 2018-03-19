import Items.Instruments.Viola;
import Items.Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolaTest {

    Viola viola;

    @Before
    public void before() {
        viola = new Viola(Type.STRING, "A description of this item","Junemann", 10000.00, 12500.00);
    }

    @Test
    public void hasType() {
        assertEquals(Type.STRING, viola.getType());
    }

    @Test
    public void hasDescription() {
        assertEquals("A description of this item", viola.getDescription());
    }

    @Test
    public void hasBuilder() {
        assertEquals("Junemann", viola.getBuilder());
    }

    @Test
    public void canPlay() {
        assertEquals("The sound of the viola ...", viola.play());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(10000.00, viola.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(12500.00, viola.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(2500.00, viola.calculateMarkup(), 0.01);
    }

}
