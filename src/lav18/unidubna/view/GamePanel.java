package lav18.unidubna.view;

import lav18.unidubna.controller.GameButtonController;
import lav18.unidubna.model.Game;

import javax.swing.*;

public class GamePanel extends JPanel {
    JButton[] button = new JButton[9];
    Game game = Game.getInstance();

    public GamePanel(){

        for (int i = 0; i < 9; i++){
            button[i] = new JButton(" ");
            add(button[i]);
            button[i].addActionListener(new GameButtonController(i, button[i]));
        }


    }

    public void UpdateButtonText(int buttonId){
        button[buttonId].setText(game.getField()[buttonId]);
        if(game.getField()[buttonId] == " ") button[buttonId].setEnabled(true);
    }


}
