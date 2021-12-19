import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class ArtistTest {
    String contactInformation;
    String NFT_title;
    String NFT_description;
    NFT nft;
    String login;
    String password;
    Artist artist;

    @Before
    public void setUp() throws Exception {
        contactInformation = "lera@gmail.com";
        NFT_title = "12345";
        NFT_description = "hello";
        nft = new NFT(NFT_title, NFT_description);
        login = "lera";
        password = "lera";
    }

    @Test
    public void testGetContactInformation() {
        Artist artist = new Artist();
        artist.setContactInformation("test");
        assertFalse(artist.getContactInformation() == "test1");
    }


    @Test
    public void testSetContactInformation() {
        Artist artist = new Artist();
        artist.setContactInformation("test");
        assertTrue(artist.getContactInformation() == "test");
    }


    @Test
    public void testConstructor(){
        Artist artist = new Artist(login, password, contactInformation,Artist.Status.POPULAR );
        assertTrue(artist.login.equals("lera"));
        assertTrue(artist.password.equals("lera"));
        assertTrue(artist.contactInformation.equals("lera@gmail.com"));
        assertTrue(artist.status.toString().equals(Artist.Status.POPULAR));
    }
}

