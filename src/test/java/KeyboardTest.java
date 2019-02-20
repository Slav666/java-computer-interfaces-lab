import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard("Mandarin", 100);
    }

    @Test
    public void canGetLanguage(){
        assertEquals("Mandarin", keyboard.getLanguage());
    }

    @Test
    public void canGetNumberOfKeys(){
        assertEquals(100, keyboard.getNumberOfKeys());
    }

    @Test
    public void canReceiveData(){
        assertEquals("I am sending data click click", keyboard.sendData());
    }

}
