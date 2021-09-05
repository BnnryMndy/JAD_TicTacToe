package lav18.unidubna.view;

import lav18.unidubna.controller.MainMenuController;
import lav18.unidubna.model.Game;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {
    Game game = Game.getInstance();
    JButton StartButton = new JButton("Start game");
    JButton StartLabel = new JButton("Tic Tac Toe");


    public MenuPanel(Container container, GamePanel gamePanel, JFrame frame){
        setLayout(new GridLayout(2,1));
        StartButton.setFont(new Font("Arial", Font.BOLD, 40));
        StartLabel.setFont(new Font("Arial", Font.BOLD, 40));
        StartLabel.setEnabled(false);
//        StartLabel
        add(StartLabel);
        StartButton.addActionListener(new MainMenuController(container, gamePanel, frame));
        add(StartButton);


    }
}
