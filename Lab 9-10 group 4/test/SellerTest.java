import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SellerTest {

    @Test
    public void testSetListOfNFT() {
        Seller seller = new Seller();
        ArrayList NFTs = new ArrayList();
        seller.setListOfNFT(NFTs);
        assertTrue(seller.getListOfNFT() == NFTs);
    }

    @Test
    public void testSetBalance() {
        Seller seller = new Seller();
        seller.setBalance(100);
        assertTrue(seller.getBalance() == 100);
    }

    @Test
    public void testGetListOfNFT() {
        Seller seller = new Seller();
        ArrayList NFTs = new ArrayList();
        ArrayList NFTs2 = new ArrayList();
        seller.setListOfNFT(NFTs);
        assertFalse(seller.getListOfNFT() == NFTs2);
    }

    @Test
    public void testGetBalance() {
        Seller seller = new Seller();
        seller.setBalance(0);
        assertFalse(seller.getBalance() == 100);
    }
    @Test
    public void testConstructor(){
        ArrayList NFTs = new ArrayList();
        Seller seller = new Seller(NFTs, 1000);
        assertTrue(seller.getListOfNFT() == NFTs);
        assertTrue(seller.getBalance() == 1000);
    }

}