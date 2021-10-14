package g48962.atl.blackjack.view;

import java.util.Scanner;
import g48962.atl.blackjack.model.*;
import java.util.List;

/**
 * This is the classe View.
 *
 * @author Michel
 */
public class View {

    private final Scanner scanner;
    private final Blackjack model;

    /**
     * This is the constructor View.
     *
     * @param model is the facade of the game.
     */
    public View(Blackjack model) {
        this.scanner = new Scanner(System.in);
        this.model = model;
    }

    /**
     * This method allows to dispay the player's cards.
     */
    public void displayCardPlayer() {
        List<Card> handPlayer = model.getPlayer().getHand();
        for (Card cardPlayer : handPlayer) {
            System.out.println("Player's cards: " + cardPlayer.getValue() + " "
                    + cardPlayer.getColor());
        }
    }

    /**
     * This method allows to display the bank's cards.
     */
    public void displayCardBank() {
        List<Card> handBank = model.getBank().getHand();
        for (Card cardBank : handBank) {
            System.out.println("Bank's cards: " + cardBank.getValue() + " "
                    + cardBank.getColor());
        }
    }

    /**
     * This method allows to display all the cards of the deck.
     */
    public void displayDeck() {
        List<Card> deck = model.getDeck().getDeck();
        for (Card card : deck) {
            System.out.println("Deck's description: " + card.getValue() + " "
                    + card.getColor());
        }
    }

    /**
     * This method allows to ask to the player if he wants to hit.
     */
    public void askPlayerToHit() {
        System.out.println("Do you want to hit ? [yes or no]");
    }

    /**
     * This method allows to display the player's score.
     */
    public void displayPlayerScore() {
        int scorePlayer = model.getPlayer().scorePlayer();
        System.out.println("Player's score: " + scorePlayer);
    }

    /**
     * This method allows to display the bank's score.
     */
    public void displayBankerScore() {
        int scoreBanker = model.getBank().scorePlayer();
        System.out.println("Bank's score: " + scoreBanker);
    }

    /**
     * This method allows to display th
     */
    public void displayIsScorePlayerGood() {
        boolean isScorePlayerGood = model.scorePlayerExceed();
        if (isScorePlayerGood) {
            System.out.println("The player has exced 21 ! He's lost the game !");
        }
    }

    /**
     * This method allows to display the bank when he will have won the game.
     */
    public void displayWinnerBank() {
        System.out.println("The winner is the Bank !");
    }
    
    /**
     * This method allows to display the player when he will have won the game.
     */
    public void displayWinnerPlayer() {
        System.out.println("The is winner is the player !");
    }

    /**
      This method allows to display the winner between the player and the bank.
     */
    public void displayWinner() {

        if (model.winner() == null) {
            System.out.println("It's a draw between the player and the Bank !");
        } else if (model.winner().equals(model.getBank())) {
            System.out.println("The winner is the Bank !");
        } else {
            System.out.println("The winner is the player !");
        }
    }
    
    public String wrongAnswer(String answer){
        while(!answer.equals("Yes") && !answer.equals("yes")
                && !answer.equals("YES") && !answer.equals("No")
                && !answer.equals("no") && !answer.equals("NO")){
            System.out.println("Veuillez entrer 'Yes' ou 'No': ");
            answer = scanner.next();
        }
        return answer;
    }
}
