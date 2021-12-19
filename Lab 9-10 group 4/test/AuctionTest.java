import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class AuctionTest {

    Auction auction;

    @Before
    public void setUp() throws Exception {
        auction = new Auction(100, 2000000, new Date(2021, 12,19));
    }

    @Test
    public void constructorTest(){
        assertEquals(100, auction._minPrice);
        assertEquals(2000000, auction._maxPrice);
        assertEquals(new Date(2021, 12,19), auction._expiryDate);
    }

    @Test
    public void testSetMinPrice() {
        auction.setMinPrice(10000);
        assertEquals(10000, auction.getMinPrice());
    }

    @Test
    public void testGetMinPrice() {
        assertEquals(100, auction.getMinPrice());
    }

    @Test
    public void testSetMaxPrice() {
        auction.setMaxPrice(1000000);
        assertEquals(1000000, auction.getMaxPrice());
    }

    @Test
    public void testGetMaxPrice() {
        assertEquals(2000000, auction.getMaxPrice());
    }

    @Test
    public void testSetExpiryDate() {
        auction.setExpiryDate(new Date(2021, 12, 20));
        assertEquals(new Date(2021, 12, 20), auction.getExpiryDate());
    }

    @Test
    public void testGetExpiryDate() {
        assertEquals(new Date(2021, 12,19), auction.getExpiryDate());
    }
}