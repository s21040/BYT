import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SaleTest {

    Sale price;

    @Before
    public void setUp() throws Exception {
        price = new Sale(200);
    }

    @Test
    public void constructorTest() {
        assertEquals(200, price.getPrice());
    }


    @Test
    public void testGetPrice() {
        assertTrue(price.getPrice() == 200);
    }

    @Test
    public void testSetPrice() {
        price.setPrice(300);
        assertEquals(300, price.getPrice());
    }

    @Test
    public void applyIteamForSale() {
    }
}