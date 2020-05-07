import edu.wpi.cs3733.entity.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Tests for your observer pattern; make sure your code works!
 * Test-driven development is a good idea here.
 */
public class ObserverTests {

    @Test
    public void testSetText() {
        Message message = new Message();
        message.setText("");
        assertEquals("", message.getText());
    }

}