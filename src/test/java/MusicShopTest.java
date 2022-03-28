import Instruments.Cowbell;
import Instruments.InstrumentType;
import Items4sale.DrumStick;
import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    Cowbell cowbell;
    MusicShop musicShop;
    ArrayList<ISell> stock;
    DrumStick drumStick;

    @Before
    public void before() {
        cowbell = new Cowbell("metal", "black", InstrumentType.PERCUSSION, 3.33, 9.99);
        drumStick = new DrumStick("It's a stick", 5.00, 15.00);
        stock = new ArrayList<>();
        musicShop = new MusicShop(stock);
    }

    @Test
    public void musicShopStartsEmpty(){
        assertEquals(0, musicShop.getNumberOfItemsOfStock());
    }

    @Test
    public void canAddItemsToStock(){
        musicShop.addItemToStock(cowbell);
        musicShop.addItemToStock(drumStick);
        assertEquals(2, musicShop.getNumberOfItemsOfStock());
    }

    @Test
    public void canRemoveItemFromStock(){
        musicShop.addItemToStock(cowbell);
        musicShop.addItemToStock(drumStick);
        musicShop.removeItemFromStock(cowbell);
        assertEquals(1, musicShop.getNumberOfItemsOfStock());
    }

    @Test
    public void canGetTotalPotentialProfit(){
        musicShop.addItemToStock(cowbell);
        musicShop.addItemToStock(drumStick);
        musicShop.addItemToStock(drumStick);
        assertEquals(26.66, musicShop.getTotalPotentialProfit(), 0);
    }
}
