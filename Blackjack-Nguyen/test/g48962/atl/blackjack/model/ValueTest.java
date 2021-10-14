package g48962.atl.blackjack.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michel
 */
public class ValueTest {

    /**
     * Test of values method, of class Value.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Value[] expResult = Value.ACE.values();
        Value[] result = Value.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class Value.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "ACE";
        Value expResult = Value.ACE;
        Value result = Value.valueOf(name);
        assertEquals(expResult, result);
    }

    /**
     * Test of getValue method, of class Value.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Value instance = Value.ACE;
        int expResult = 1;
        int result = instance.getValue();
        assertEquals(expResult, result);
    }
}
