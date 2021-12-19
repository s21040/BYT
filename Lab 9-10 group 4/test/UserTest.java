import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    String login;
    String password;

    @Before
    public void setUp() throws Exception {
        login = "lera";
        password = "lera";
    }

    @Test
    public void testConstructor(){
        User user = new User(login, password);
        assertTrue(user.login.equals("lera"));
        assertTrue(user.password.equals("lera"));
    }

}