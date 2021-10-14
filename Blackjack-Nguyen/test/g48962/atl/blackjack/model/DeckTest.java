package g48962.atl.blackjack.model;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michel
 */
public class DeckTest {

    /**
     * Test of getDeck method, of class Deck.
     */
    @Test
    public void testGetDeck() {
        System.out.println("getDeck");
        Deck instance = new Deck();
        List<Card> expResult = instance.getDeck();
        List<Card> result = instance.getDeck();
        assertEquals(expResult, result);
    }

    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        Deck instance = new Deck();
        instance.shuffle();
    }

    /**
     * Test of isEmpty method, of class Deck.
     */
    @Test
    public void testIsEmptyFalse() {
        System.out.println("isEmptyFalse");
        Deck instance = new Deck();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isEmpty method, of class Deck.
     */
    @Test
    public void testIsEmptyTrue() {
        System.out.println("isEmptyTrue");
        Deck instance = new Deck();
        instance.getDeck().removeAll(instance.getDeck());
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }
    

    /**
     * Test of hit method, of class Deck.
     */
    @Test
    public void testHit() {
        System.out.println("hit");
        Deck instance = new Deck();
        Card result = instance.hit();
        Card expResult = result;
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class Deck.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Deck instance = new Deck();
        int expResult = 52;
        int result = instance.size();
        assertEquals(expResult, result);
    }
    
}
