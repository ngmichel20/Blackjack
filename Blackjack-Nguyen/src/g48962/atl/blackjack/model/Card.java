package g48962.atl.blackjack.model;

/**
 * This is the class Card.
 *
 * @author g48962
 */
public class Card {

    private Color color;
    private Value value;

    /**
     * This is the contructor "Card".
     *
     * @param color is the card's color.
     * @param value is the card's value.
     */
    public Card(Color color, Value value) {
        if (color == null || value == null) {
            throw new IllegalArgumentException("La couleur ou la valeur n'existe pas");
        }
        this.color = color;
        this.value = value;
    }

    /**
     * This is the getter of color.
     *
     * @return the card's color.
     */
    public Color getColor() {
        return color;
    }

    /**
     * This is the getter of value.
     *
     * @return the card's value.
     */
    public Value getValue() {
        return value;
    }

}
