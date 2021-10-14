package g48962.atl.blackjack.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the class Player.
 *
 * @author Michel
 */
public class Player {

    private final List<Card> hand;

    /**
     * This is the contructor "Player".
     *
     */
    public Player() {
        this.hand = new ArrayList<>();
    }

    /**
     * This is the getter of hand.
     * 
     * @return a list of cards.
     */
    public List<Card> getHand() {
        return hand;
    }
    
    

    /**
     * This is method allows to add a card in the player's hand.
     * 
     * @param card is the card.
     */
    public void addHandCard(Card card) {
        this.hand.add(card);
    }

    /**
     * This method allows to show the score of the player or the bank.
     * 
     * @return the score.
     */
    public int scorePlayer() {
        int score = 0;
        for (Card card : this.hand) {
            score += card.getValue().getValue();
        }
        return score;
    }
    
}
