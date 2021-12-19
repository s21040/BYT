import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MediaTest {
    Media weight;

    @Before
    public void setUp() throws Exception {
        weight = new Media(3);
    }

    @Test
    public void constructorTest(){
        Media media = new Media(2);
        assertEquals(2 , media.weight);
    }

    @Test
    public void testGetWeight() {
        assertEquals(3, weight.getWeight());
    }

    @Test
    public void testSetWeight() {
        weight.setWeight(4);
        assertEquals(4, weight.getWeight());
    }
}