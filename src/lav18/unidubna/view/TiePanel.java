package lav18.unidubna.view;

import lav18.unidubna.controller.MainMenuController;
import lav18.unidubna.model.Game;

import javax.swing.*;
import java.awt.*;

public class TiePanel extends JPanel{
    Game game = Game.getInstance();
    JButton StartButton = new JButton("play again");
    JButton StartLabel = new JButton("T I E");


    public TiePanel(Container container, GamePanel gamePanel, JFrame frame){

        setLayout(new GridLayout(2,1));
        StartButton.setFont(new Font("Arial", Font.BOLD, 40));
        StartLabel.setFont(new Font("Arial", Font.BOLD, 40));
        StartLabel.setEnabled(false);
        add(StartLabel);
        StartButton.addActionListener(new MainMenuController(container, gamePanel, frame));
        add(StartButton);
    }
}
