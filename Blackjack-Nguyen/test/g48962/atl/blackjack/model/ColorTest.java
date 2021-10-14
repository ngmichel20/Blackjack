package g48962.atl.blackjack.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michel
 */
public class ColorTest {

    /**
     * Test of valueOf method, of class Color.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "CLUB";
        Color expResult = Color.valueOf(name);
        Color result = Color.valueOf(name);
        assertEquals(expResult, result);
    }
    
}
