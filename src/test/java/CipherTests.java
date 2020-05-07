
import edu.wpi.cs3733.entity.CaesarCipher;
import edu.wpi.cs3733.entity.ElbonianCipher;
import edu.wpi.cs3733.entity.Message;
import org.junit.Test;

import javax.crypto.Cipher;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


/**
 * Tests for your cipher functions; make sure your code works!
 * Test-driven development is a good idea here.
 */
public class CipherTests {

    @Test
    public void cipherSimpleTest1(){

    }

    @Test
    public void ceasarTest() {
        CaesarCipher ceasar = new CaesarCipher();
        ceasar.setText("");
        assertEquals("", ceasar.getText());
    }
    @Test
    public void elbonianTest() {
        ElbonianCipher elbonian = new ElbonianCipher();
        elbonian.setText("");
        assertEquals("", elbonian.getText());
    }

}
