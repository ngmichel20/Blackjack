package g48962.atl.blackjack.model;

/**
 * This is the enum Value.
 * 
 * @author g48962
 */
public enum Value { 
    /**
     * ACE is worth 1.
     */
    ACE(1),

    /**
     * TWO is worth 2.
     */
    TWO(2),

    /**
      THREE is worth 3.
     */
    THREE((3)),

    /**
     * FOUR is worth 4.
     */
    FOUR(4),

    /**
     * FIVE is worth 5.
     */
    FIVE(5),

    /**
     * SIX is worth 6.
     */
    SIX(6),

    /**
     * SEVEN is worth 7.
     */
    SEVEN(7),

    /**
     * EIGHT is worth 8.
     */
    EIGHT(8),

    /**
     * NICE is worth 9.
     */
    NINE(9),

    /**
     * TEN is worth 10.
     */
    TEN(10),

    /**
     * JACK is worth 10.
     */
    JACK(10),

    /** 
     * QUEEN is worth 10.
     */
    QUEEN(10),

    /**
     * KING is worth 10.
     */
    KING(10);
    
    private final int value;

    private Value(int value) {
        this.value = value;
    }

    /**
     * This is the getter value.
     * 
     * @return the value of the card.
     */
    public int getValue() {
        return value;
    }
    
    
}
