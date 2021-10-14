package g48962.atl.blackjack.controller;

import g48962.atl.blackjack.model.Blackjack;
import g48962.atl.blackjack.model.Deck;
import g48962.atl.blackjack.model.Player;
import g48962.atl.blackjack.view.View;
import java.util.Scanner;

/**
 * This is the Controller
 *
 * @author Michel
 */
public class Controller {

    private final Blackjack game;
    private final View view;

    /**
     * This is the Controller's constructor.
     *
     * @param game is the facade pattern of Blackjack.
     * @param view is the view (the display) of the game.
     */
    public Controller(Blackjack game, View view) {
        this.game = game;
        this.view = view;
    }

    /**
     * This method allows to start the game.
     */
    public void startGame() {
        Blackjack game = new Blackjack();
        View view = new View(game);

        Player player = game.getPlayer();
        Player bank = game.getBank();
        Deck deck = game.getDeck();

        Scanner scanner = new Scanner(System.in);

        view.displayDeck();
        //Debut du jeu
        game.newRound();
        view.displayCardPlayer();
        view.displayPlayerScore();

        view.askPlayerToHit();
        String answer = scanner.next();
        view.wrongAnswer(answer);
        while (!game.scorePlayerExceed() && game.askToContinue(player, answer)) {
            game.playerHit(player, answer);
            view.displayCardPlayer();
            view.displayPlayerScore();
            if (game.scorePlayerExceed()) {
                view.displayIsScorePlayerGood();
                view.displayWinnerBank();
            } else {
                view.askPlayerToHit();
                answer = scanner.next();
                view.wrongAnswer(answer);
            }
        }
        if (!game.scorePlayerExceed()) {
            game.bankHit(bank);
            view.displayCardBank();
            view.displayBankerScore();
            if (!game.scoreBankExceed()) {
                view.displayWinner();
            } else {
                view.displayWinnerPlayer();
            }
        }
    }

}
