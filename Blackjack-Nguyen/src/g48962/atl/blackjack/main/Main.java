package g48962.atl.blackjack.main;

import g48962.atl.blackjack.model.*;
import g48962.atl.blackjack.view.View;
import g48962.atl.blackjack.controller.Controller;

/**
 * This is the main class.
 *
 * @author Michel
 */
public class Main {

    /**
     * This is the main method of the game.
     *
     * @param args
     */
    public static void main(String[] args) {
        Blackjack game = new Blackjack();
        View view = new View(game);
        Controller controller = new Controller(game, view);
        controller.startGame();
    }
}
