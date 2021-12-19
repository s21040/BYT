import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImageTest {

    Image.Format format1,format2, format3, format4, format5;
    Image image1,image2,image3,image4,image5;

    @Before
    public void setUp() throws Exception {
        format1 = Image.Format.PNG;
        format2 = Image.Format.JPG;
        format3 = Image.Format.JP2;
        format4 = Image.Format.GIF;
        format5 = Image.Format.TIFF;
        image1 = new Image(1, format1, "2000*2000");
        image2 = new Image(2, format2, "1908*400");
        image3 = new Image(3, format3, "2010*1000");
        image4 = new Image(4, format4, "2440*2700");
        image5 = new Image(5, format5, "200*2040");
    }

    @Test
    public void constructorTest() {
        assertEquals(3, image3.getWeight());
        assertEquals("2440*2700", image4.getResolution());
    }

    @Test
    public void testGetResolution() {
        assertEquals("200*2040", image5.getResolution());
    }

    @Test
    public void testSetResolution() {
        image4.setResolution("3000*500");
        assertEquals("3000*500", image4.getResolution());
    }

    @Test
    public void testGetFormat() {
        assertEquals("png", image1.format.getFormat());
    }

    @Test
    public void testSetFormat() {
        image2.format.setFormat("jpg");
        assertEquals("jpg", image2.format.getFormat());
    }
}
