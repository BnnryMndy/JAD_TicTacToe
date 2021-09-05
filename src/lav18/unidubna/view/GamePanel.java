package lav18.unidubna.view;

import lav18.unidubna.controller.GameButtonController;
import lav18.unidubna.model.Game;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    JButton[] button = new JButton[9];
    Game game = Game.getInstance();

    public GamePanel(Container container, JFrame frame){
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++){
            button[i] = new JButton(" ");
            add(button[i]);
            button[i].setFont(new Font("Arial", Font.BOLD, 40));
            button[i].addActionListener(new GameButtonController(i, button[i], this, container, frame));

        }
        frame.repaint(10);

    }

    public void UpdateButtonText(){
        for (int buttonId = 0; buttonId < 9; buttonId++) {
            button[buttonId].setText(game.getField()[buttonId]);
            if(game.getField()[buttonId] == " ") button[buttonId].setEnabled(true);
        }
    }


}
