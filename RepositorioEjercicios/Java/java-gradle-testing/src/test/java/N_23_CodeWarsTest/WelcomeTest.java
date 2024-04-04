package N_23_CodeWarsTest;

import org.example.N_23_CodeWars.Welcome;
import org.junit.Test;
import static  org.junit.Assert.*;

public class WelcomeTest {
    @Test
    public void asserTest(){
        assertEquals("Welcome", Welcome.greet("english"));
        assertEquals("Vitejte", Welcome.greet("czech"));
        assertEquals("Witamy", Welcome.greet("polish"));
        assertEquals("Welcome", Welcome.greet("IP_ADDRESS_INVALID"));
        assertEquals("Laukiamas", Welcome.greet("lithuanian"));
        assertEquals("Bienvenido", Welcome.greet("spanish"));
        assertEquals("Croeso", Welcome.greet("welsh"));
        assertEquals("Velkomst", Welcome.greet("danish"));
        assertEquals("Laukiamas", Welcome.greet("lithuanian"));
    }
}
