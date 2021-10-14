package g48962.atl.blackjack.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michel
 */
public class CardTest {

    /**
     * Test of getColor method, of class Card.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Card instance = new Card(Color.CLUB, Value.ACE);
        Color expResult = Color.CLUB;
        Color result = instance.getColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getValue method, of class Card.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Card instance = new Card(Color.CLUB, Value.ACE);
        Value expResult = Value.ACE;
        Value result = instance.getValue();
        assertEquals(expResult, result);
    }
    
}
