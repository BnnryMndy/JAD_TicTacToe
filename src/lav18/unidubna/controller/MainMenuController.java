package lav18.unidubna.controller;

import lav18.unidubna.model.Game;
import lav18.unidubna.view.GamePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuController implements ActionListener {
    Game game = Game.getInstance();
    Container container;
    GamePanel gamePanel;
    JFrame frame;

    public MainMenuController(Container container, GamePanel gamePanel, JFrame frame) {
        this.container = container;
        this.gamePanel = gamePanel;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        game.AddPlayers("X", "O");
        game.NewGame();
        container.removeAll();
        frame.repaint();
        gamePanel.UpdateButtonText();
        container.add(gamePanel);
        frame.revalidate();
    }
}
