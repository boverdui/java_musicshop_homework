import Items.Other.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("A description of this item","Cello Suites", "Bach", 5.00, 10.00);
    }

    @Test
    public void hasDescription() {
        assertEquals("A description of this item", sheetMusic.getDescription());
    }

    @Test
    public void hasTitle() {
        assertEquals("Cello Suites", sheetMusic.getTitle());
    }

    @Test
    public void hasComposer() {
        assertEquals("Bach", sheetMusic.getComposer());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(5.00, sheetMusic.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(10.00, sheetMusic.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(5.00, sheetMusic.calculateMarkup(), 0.01);
    }

}
