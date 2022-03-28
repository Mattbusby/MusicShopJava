import Items4sale.DrumStick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void before(){
        drumStick = new DrumStick("It's a stick", 5.00, 15.00);
    }

    @Test
    public void hasDescription(){
        assertEquals("It's a stick", drumStick.getDescription());
    }

    @Test
    public void hasBoughtFor(){
        assertEquals(5.00, drumStick.getBoughtFor(), 0);
    }

    @Test
    public void hasSellingFor(){
        assertEquals(15.00, drumStick.getSellingFor(), 0);
    }

    @Test
    public void hasMarkup(){
        assertEquals(10.00, drumStick.calculateMarkup(), 0);
    }
}
