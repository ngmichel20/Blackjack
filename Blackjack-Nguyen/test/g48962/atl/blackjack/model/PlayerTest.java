package g48962.atl.blackjack.model;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michel
 */
public class PlayerTest {

    /**
     * Test of getHand method, of class Player.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        Player instance = new Player();
        Card card = new Card(Color.CLUB, Value.ACE);
        instance.addHandCard(card);
        List<Card> expResult = instance.getHand();
        List<Card> result = instance.getHand();
        assertEquals(expResult, result);
    }

    /**
     * Test of addHandCard method, of class Player.
     */
    @Test
    public void testAddHandCard() {
        System.out.println("addHandCard");
        Card card = new Card(Color.CLUB, Value.ACE);
        Player instance = new Player();
        instance.addHandCard(card);
    }

    /**
     * Test of scorePlayer method, of class Player.
     */
    @Test
    public void testScorePlayer() {
        System.out.println("scorePlayer");
        Player instance = new Player();
        Card card = new Card(Color.CLUB, Value.ACE);
        instance.addHandCard(card);
        int expResult = 1;
        int result = instance.scorePlayer();
        assertEquals(expResult, result);
    }
}
