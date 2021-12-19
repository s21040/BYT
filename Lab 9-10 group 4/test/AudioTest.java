import org.junit.Before;
import org.junit.Test;

import java.time.Duration;

import static org.junit.Assert.*;

public class AudioTest {

    Duration duration;
    Audio.Format format1,format2, format3, format4, format5;
    Audio audio1, audio2, audio3, audio4, audio5;

    @Before
    public void setUp() throws Exception {
        format1 = Audio.Format.MP3;
        format2 = Audio.Format.AAC;
        format3 = Audio.Format.WAV;
        format4 = Audio.Format.ALAC;
        format5 = Audio.Format.FLAC;
        audio1 = new Audio(1, format1, duration.ofMinutes(35));
        audio2 = new Audio(2, format2, duration.ofMinutes(40));
        audio3 = new Audio(3, format3, duration.ofMinutes(50));
        audio4 = new Audio(4, format4, duration.ofMinutes(12));
        audio5 = new Audio(5, format5, duration.ofMinutes(45));
    }

    @Test
    public void constructorTest() {
        assertEquals(1, audio1.getWeight());
        assertEquals(Duration.ofMinutes(40), audio2.getDuration());
    }

    @Test
    public void testGetDuration() {
        assertEquals(Duration.ofMinutes(50), audio3.getDuration());
    }

    @Test
    public void testSetDuration() {
        audio3.setDuration(Duration.ofMinutes(60));
        assertEquals(Duration.ofMinutes(60), audio3.getDuration());
    }

    @Test
    public void testGetFormat() {
        assertEquals("alac", audio4.format.getFormat());
    }

    @Test
    public void testSetFormat() {
        audio5.format.setFormat("flac");
        assertEquals("flac", audio5.format.getFormat());
    }
}