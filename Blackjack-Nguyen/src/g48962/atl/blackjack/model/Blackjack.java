package g48962.atl.blackjack.model;

/**
 * This is the class Blackjack.
 * 
 * @author Michel
 */
public class Blackjack {

    private final Deck deck;
    private final Player player;
    private final Player bank;

    /**
     * This is the constructor of "Blackjack".
     */
    public Blackjack() {
        this.deck = new Deck();
        this.player = new Player();
        this.bank = new Player();
    }

    /**
     * This is the getter of "deck".
     *
     * @return the deck.
     */
    public Deck getDeck() {
        return deck;
    }

    /**
     * This is the getter of "player".
     *
     * @return the player.
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * This is the getter of "bank".
     *
     * @return the bank.
     */
    public Player getBank() {
        return bank;
    }

    /**
     * This method allows to launch a new round.
     */
    public void newRound() {
        this.deck.shuffle();
        if (!deck.isEmpty()) {
            for (int i = 0; i < 2; i++) {
                player.addHandCard(this.deck.hit());
            }
        }
    }

    /**
     * This method allows to ask the player if he wants to continue.
     *
     * @param player is the player who plays.
     * @param answer is the answer of the player.
     * @return true if the answer is yes.
     */
    public boolean askToContinue(Player player, String answer) {
        boolean askContinue = false;
        if (answer.equals("Yes") || answer.equals("yes")
                || answer.equals("YES")) {
            askContinue = true;
        } else if (answer.equals("No")
                || answer.equals("no") || answer.equals("NO")) {
            askContinue = false;
        }
        return askContinue;
    }

    /**
     * This method allows the player to hit a card of the deck.
     *
     * @param player is the player who plays.
     * @param answer is the answer of the player.
     */
    public void playerHit(Player player, String answer) {
        if (askToContinue(player, answer)) {
            this.player.addHandCard(this.deck.hit());
        }

    }

    /**
     * This method allows to know if the score's player has exced 21.
     *
     * @return true is the score's player has been exced.
     */
    public boolean scorePlayerExceed() {
        boolean isScoreExceed = false;
        if (this.player.scorePlayer() > 21) {
            isScoreExceed = true;
        }
        return isScoreExceed;
    }
    
    /**
     * This method allows to know if the bank has exced 21.
     * 
     * @return true if the bank exceeds 21.
     */
    public boolean scoreBankExceed() {
        boolean isScoreBankExceed = false;
        if (this.bank.scorePlayer() > 21) {
            isScoreBankExceed = true;
        }
        return isScoreBankExceed;
    }
    

    /**
     * This method allows to the bank to hit cards.
     *
     * @param player is the player who plays.
     */
    public void bankHit(Player player) {
        while (!scoreIA()) {
            this.bank.addHandCard(this.deck.hit());
        }
    }

    /**
     * This method allows to know when the bank's score will reach at least 17.
     *
     * @return true if the score's bank reachs at least 17.
     */
    public boolean scoreIA() {
        boolean isScoreBankExceed = false;
        if (this.bank.scorePlayer() >= 17) {
            isScoreBankExceed = true;
        }
        return isScoreBankExceed;
    }

    /**
     * This method allows to know the winner of the game between the player and
     * the bank.
     *
     * @return a winner of the Type "Player".
     */
    public Player winner() {
        Player winner = null;
        int scoreBank = this.bank.scorePlayer() - 21;
        int scorePlayer = this.player.scorePlayer() - 21;       
        if (Math.abs(scoreBank) > Math.abs(scorePlayer)) {
            winner = this.player;
        } else if (Math.abs(scorePlayer) > Math.abs(scoreBank)) {
            winner = this.bank;
        }
        return winner;
    }
}
