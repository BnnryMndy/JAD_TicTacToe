package lav18.unidubna;

import lav18.unidubna.model.Game;
import lav18.unidubna.view.View;

public class Main {

    public static void main(String[] args) {
        Game game = Game.getInstance();
        game.AddPlayers("player 1", "Player 2");
        View view = new View();
        view.setVisible(true);

    }
}
