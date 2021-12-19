import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testGetLogin() {
        Person person = new Artist();
        person.setLogin("login");
        assertTrue(person.getLogin() == "login");

    }

    @Test
    public void testSetLogin() {
        Person person = new Artist();
        person.setLogin("login");
        assertFalse(person.getLogin() == "login1");

    }

    @Test
    public void testGetPassword() {
        Person person = new Artist();
        person.setPassword("password");
        assertFalse(person.getPassword() == "password1");
    }

    @Test
    public void testSetPassword() {
        Person person = new Artist();
        person.setPassword("password");
        assertTrue(person.getPassword() == "password");
    }
    @Test
    public void testConstructor(){
        Person person = new Artist();
        assertTrue(person.getPassword() == "password");
        assertTrue(person.getLogin() == "login");
    }
}