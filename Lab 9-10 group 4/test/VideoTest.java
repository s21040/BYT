import org.junit.Before;
import org.junit.Test;

import java.time.Duration;

import static org.junit.Assert.*;

public class VideoTest {

    Duration duration;
    Video.Format format1,format2, format3, format4;
    Video video1, video2, video3, video4;

    @Before
    public void setUp() throws Exception {
        format1 = Video.Format.AAC;
        format2 = Video.Format.AVI;
        format3 = Video.Format.MOV;
        format4 = Video.Format.MP4;
        video1 = new Video(1, format1, duration.ofMinutes(35));
        video2 = new Video(2, format2, duration.ofMinutes(50));
        video3 = new Video(3, format3, duration.ofMinutes(20));
        video4 = new Video(4, format4,duration.ofMinutes(40));
    }

    @Test
    public void constructorTest() {
        assertEquals(1, video1.getWeight());
        assertEquals(Duration.ofMinutes(20), video3.getDuration());
    }

    @Test
    public void testGetDuration() {
        assertEquals(Duration.ofMinutes(50), video2.getDuration());
    }

    @Test
    public void testSetDuration() {
        video2.setDuration(Duration.ofMinutes(34));
        assertEquals(Duration.ofMinutes(34), video2.getDuration());
    }

    @Test
    public void testGetFormat() {
        assertEquals("mov", video3.format.getFormat());
    }

    @Test
    public void testSetFormat() {
        video1.format.setFormat("mp4");
        assertEquals("mp4", video1.format.getFormat());
    }
}