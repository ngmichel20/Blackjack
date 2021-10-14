package g48962.atl.blackjack.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is the class Deck.
 *
 * @author g48962
 */
public class Deck {

    private final List<Card> deck = new ArrayList<>();

    /**
     * This is the contructor "Deck".
     */
    public Deck() {
        Card card;
        for (Color color : Color.values()) {
            for (Value value : Value.values()) {
                if (color != null && value != null) {
                    card = new Card(color, value);
                    deck.add(card);
                }
            }
        }
    }

    /**
     * This is the getter of deck.
     *
     * @return a list of cards.
     */
    public List<Card> getDeck() {
        return deck;
    }

    /**
     * This method allows to shuffle the deck.
     */
    public void shuffle() {
        Collections.shuffle(deck);
    }

    /**
     * This method allows to know if the deck is empty or not.
     *
     * @return true if the deck is empty.
     */
    public boolean isEmpty() {
        return deck.isEmpty();
    }

    /**
     * This method allows to hit the card of the top of the deck.
     *
     * @return a card.
     */
    public Card hit() {
        Card card = null;
        if (!isEmpty()) {
            card = deck.get(0);
            deck.remove(0);
        }
        return card;
    }

    /**
     * This method allows to know the number of cards of the deck.
     *
     * @return the size of the deck.
     */
    public int size() {
        return deck.size();
    }
}
