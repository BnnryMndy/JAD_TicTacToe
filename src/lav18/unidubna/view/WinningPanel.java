package lav18.unidubna.view;

import lav18.unidubna.controller.MainMenuController;
import lav18.unidubna.model.Game;

import javax.swing.*;
import java.awt.*;

public class WinningPanel extends JPanel {
    Game game = Game.getInstance();
    JButton StartButton = new JButton("play again");
    JButton StartLabel;


    public WinningPanel(Container container, GamePanel gamePanel, JFrame frame){

        setLayout(new GridLayout(2,1));
        StartButton.setFont(new Font("Arial", Font.BOLD, 40));
        StartLabel = new JButton(game.WhoStep() + " win");
        StartLabel.setFont(new Font("Arial", Font.BOLD, 40));
        StartLabel.setEnabled(false);
        add(StartLabel);
        StartButton.addActionListener(new MainMenuController(container, gamePanel, frame));
        add(StartButton);
    }
}
