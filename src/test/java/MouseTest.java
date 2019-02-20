import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

    Mouse mouse;

    @Before
    public void before(){
        mouse = new Mouse("white magic racer", true);
    }

    @Test
    public void hasType(){
        assertEquals("white magic racer", mouse.getType());
    }

    @Test
    public void hasLaser(){
        assertEquals(true, mouse.getLaser());
    }

    @Test
    public void canClick(){
        assertEquals("I am clicking", mouse.click());
    }


}
