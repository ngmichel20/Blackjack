package g48962.atl.blackjack.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michel
 */
public class BlackjackTest {

    /**
     * Test of getDeck method, of class Blackjack.
     */
    @Test
    public void testGetDeck() {
        System.out.println("getDeck");
        Blackjack instance = new Blackjack();
        Deck expResult = instance.getDeck();
        Deck result = instance.getDeck();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPlayer method, of class Blackjack.
     */
    @Test
    public void testGetPlayer() {
        System.out.println("getPlayer");
        Blackjack instance = new Blackjack();
        Player expResult = instance.getPlayer();
        Player result = instance.getPlayer();
        if (expResult instanceof Player && result instanceof Player) {
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of getBank method, of class Blackjack.
     */
    @Test
    public void testGetBank() {
        System.out.println("getBank");
        Blackjack instance = new Blackjack();
        Player expResult = instance.getBank();
        Player result = instance.getBank();
        if (expResult instanceof Player && result instanceof Player) {
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of newRound method, of class Blackjack.
     */
    @Test
    public void testNewRound() {
        System.out.println("newRound");
        Blackjack instance = new Blackjack();
        instance.getPlayer();
        instance.newRound();
    }

    /**
     * Test of askToContinue method, of class Blackjack.
     */
    @Test
    public void testAskToContinueYes() {
        System.out.println("askToContinueYes");
        Player player = new Player();
        String answer = "Yes";
        Blackjack instance = new Blackjack();
        boolean expResult = true;
        boolean result = instance.askToContinue(player, answer);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of askToContinue method, of class Blackjack.
     */
    @Test
    public void testAskToContinueNo() {
        System.out.println("askToContinueNo");
        Player player = new Player();
        String answer = "No";
        Blackjack instance = new Blackjack();
        boolean expResult = false;
        boolean result = instance.askToContinue(player, answer);
        assertEquals(expResult, result);
    }  

    /**
     * Test of playerHit method, of class Blackjack.
     */
    @Test
    public void testPlayerHitYes() {
        System.out.println("playerHitYes");
        Player player = new Player();
        String answer = "Yes";
        Blackjack instance = new Blackjack();
        instance.playerHit(player, answer);
    }
    
    
    /**
     * Test of playerHit method, of class Blackjack.
     */
    @Test
    public void testPlayerHitNo() {
        System.out.println("playerHitNo");
        Player player = new Player();
        String answer = "No";
        Blackjack instance = new Blackjack();
        instance.playerHit(player, answer);
    }

    /**
     * Test of scorePlayerExceed method, of class Blackjack.
     */
    @Test
    public void testScorePlayerExceedTrue() {
        System.out.println("scorePlayerExceedTrue");
        Blackjack instance = new Blackjack();
        Card card1 = new Card(Color.CLUB, Value.KING);
        Card card2 = new Card(Color.CLUB, Value.JACK);
        Card card3 = new Card(Color.CLUB, Value.QUEEN);
        instance.getPlayer().addHandCard(card1);
        instance.getPlayer().addHandCard(card2);
        instance.getPlayer().addHandCard(card3);
        boolean expResult = true;
        boolean result = instance.scorePlayerExceed();
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of scorePlayerExceed method, of class Blackjack.
     */
    @Test
    public void testScorePlayerExceedFalse() {
        System.out.println("scorePlayerExceedFalse");
        Blackjack instance = new Blackjack();
        Card card1 = new Card(Color.CLUB, Value.KING);
        Card card2 = new Card(Color.CLUB, Value.JACK);
        instance.getPlayer().addHandCard(card1);
        instance.getPlayer().addHandCard(card2);
        boolean expResult = false;
        boolean result = instance.scorePlayerExceed();
        assertEquals(expResult, result);
    }
    

    /**
     * Test of scoreBankExceed method, of class Blackjack.
     */
    @Test
    public void testScoreBankExceedTrue() {
        System.out.println("scoreBankExceedTrue");
        Blackjack instance = new Blackjack();
        Card card1 = new Card(Color.CLUB, Value.KING);
        Card card2 = new Card(Color.CLUB, Value.JACK);
        Card card3 = new Card(Color.CLUB, Value.QUEEN);
        instance.getBank().addHandCard(card1);
        instance.getBank().addHandCard(card2);
        instance.getBank().addHandCard(card3);
        boolean expResult = true;
        boolean result = instance.scoreBankExceed();
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of scoreBankExceed method, of class Blackjack.
     */
    @Test
    public void testScoreBankExceedFalse() {
        System.out.println("scoreBankExceedFalse");
        Blackjack instance = new Blackjack();
        Card card1 = new Card(Color.CLUB, Value.KING);
        Card card2 = new Card(Color.CLUB, Value.JACK);
        instance.getBank().addHandCard(card1);
        instance.getBank().addHandCard(card2);
        boolean expResult = false;
        boolean result = instance.scoreBankExceed();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of bankHit method, of class Blackjack.
     */
    @Test
    public void testBankHit() {
        System.out.println("bankHit");
        Player bank = new Player();
        Blackjack instance = new Blackjack();
        instance.bankHit(bank);
    }

    /**
     * Test of scoreIA method, of class Blackjack.
     */
    @Test
    public void testScoreIAFalse() {
        System.out.println("scoreIAFalse");
        Blackjack instance = new Blackjack();
        Card card1 = new Card(Color.CLUB, Value.KING);
        Card card2 = new Card(Color.CLUB, Value.FIVE);
        instance.getBank().addHandCard(card1);
        instance.getBank().addHandCard(card2);
        boolean expResult = false;
        boolean result = instance.scoreIA();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of scoreIA method, of class Blackjack.
     */
    @Test
    public void testScoreIATrue() {
        System.out.println("scoreIATrue");
        Blackjack instance = new Blackjack();
        Card card1 = new Card(Color.CLUB, Value.KING);
        Card card2 = new Card(Color.CLUB, Value.FIVE);
        Card card3 = new Card(Color.CLUB, Value.FIVE);
        instance.getBank().addHandCard(card1);
        instance.getBank().addHandCard(card2);
        instance.getBank().addHandCard(card3);
        boolean expResult = true;
        boolean result = instance.scoreIA();
        assertEquals(expResult, result);
    }

    /**
     * Test of winner method, of class Blackjack.
     */
    @Test
    public void testWinnerBank() {
        System.out.println("winnerBank");
        Blackjack instance = new Blackjack();
        Card card1 = new Card(Color.CLUB, Value.KING);
        Card card2 = new Card(Color.CLUB, Value.FIVE);
        instance.getBank().addHandCard(card1);
        instance.getPlayer().addHandCard(card2);
        Player expResult = instance.getBank();
        Player result = instance.winner();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of winner method, of class Blackjack.
     */
    @Test
    public void testWinnerPlayer() {
        System.out.println("winnerBank");
        Blackjack instance = new Blackjack();
        Card card1 = new Card(Color.CLUB, Value.KING);
        Card card2 = new Card(Color.CLUB, Value.FIVE);
        instance.getBank().addHandCard(card2);
        instance.getPlayer().addHandCard(card1);
        Player expResult = instance.getPlayer();
        Player result = instance.winner();
        assertEquals(expResult, result);
    }
}
