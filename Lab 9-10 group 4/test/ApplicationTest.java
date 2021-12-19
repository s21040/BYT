import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicationTest {
    Application.Status status1, status2, status3;

    @Before
    public void setUp() {
        status1 = Application.Status.APPROVED;
        status2 = Application.Status.WFV;
        status3 = Application.Status.AA;
    }

    @Test
    public void constructorTest(){
        Application application = new Application(status1);
        assertEquals("APPROVED" , application.status.toString());
        application = new Application(status2);
        assertEquals("WFV" , application.status.toString());
        application = new Application(status3);
        assertEquals("AA" , application.status.toString());
    }

    @Test
    public void testSetStatus() {
        status1.setStatus("WFV");
        assertEquals("WFV" , status1.getStatus());
    }

    @Test
    public void testGetStatus() {
        assertEquals("aborted application" , status3.getStatus());
    }
}