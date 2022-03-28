import Instruments.Cowbell;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CowbellTest {

    Cowbell cowbell;

    @Before
    public void before(){
        cowbell = new Cowbell("metal", "black", InstrumentType.PERCUSSION, 3.33, 9.99);
    }

    @Test
    public void hasMaterial(){
        assertEquals("metal", cowbell.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("black", cowbell.getColour());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.PERCUSSION, cowbell.getType());
    }

    @Test
    public void hasBoughtFor(){
        assertEquals(3.33, cowbell.getBoughtFor(), 0);
    }

    @Test
    public void hasSellingFor(){
        assertEquals(9.99, cowbell.getSellingFor(), 0);
    }

    @Test
    public void canPlay(){
        assertEquals("The Reaper", cowbell.play());
    }

    @Test
    public void hasMarkup(){
        assertEquals(6.66, cowbell.calculateMarkup(), 0);
    }

}
