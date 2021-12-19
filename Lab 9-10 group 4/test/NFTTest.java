import org.junit.Test;

import static org.junit.Assert.*;

public class NFTTest {

    @Test
    public void testSetTitle() {
        NFT nft = new NFT();
        nft.setTitle("NFT");
        assertTrue(nft.getTitle() == "NFT");
    }

    @Test
    public void testSetDescription() {
        NFT nft = new NFT();
        nft.setDescription("abcd");
        assertTrue(nft.getDescription().equals("abcd"));
    }

    @Test
    public void testSetArtistName() {
        Artist artist = new Artist();
        NFT nft = new NFT();
        nft.setArtistName(artist);
        assertTrue(nft.getArtistName() == artist);
    }

    @Test
    public void testGetTitle() {
        NFT nft = new NFT();
        nft.setTitle("NFT");
        assertFalse(nft.getTitle() == "NFT1");
    }

    @Test
    public void testGetDescription() {
        NFT nft = new NFT();
        nft.setDescription("abcd");
        assertFalse(nft.getDescription().equals("abcd1"));

    }

    @Test
    public void testGetArtistName() {
        Artist artist = new Artist();
        Artist artist2 = new Artist();
        NFT nft = new NFT();
        nft.setArtistName(artist);
        assertFalse(nft.getArtistName() == artist2);
    }

    @Test
    public void testConstructor(){
        NFT nft = new NFT("NFT", "IT IS NFT");
        assertTrue(nft.title.equals("NFT"));
        assertTrue(nft.description.equals("IT IS NFT"));
    }
}