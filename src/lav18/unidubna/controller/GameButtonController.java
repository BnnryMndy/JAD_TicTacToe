package lav18.unidubna.controller;

import lav18.unidubna.model.Game;
import lav18.unidubna.view.GamePanel;
import lav18.unidubna.view.TiePanel;
import lav18.unidubna.view.WinningPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameButtonController implements ActionListener {
    private int buttonID;
    private JButton button;
    GamePanel gamePanel;
    Container container;
    JFrame frame;

    private Game game = Game.getInstance();

    public GameButtonController(int buttonID, JButton button, GamePanel gamePanel, Container container, JFrame frame) {
        this.buttonID = buttonID;
        this.button = button;
        this.container = container;
        this.gamePanel = gamePanel;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        game.Step(buttonID);
        button.setText(game.getField()[buttonID]);
        button.setEnabled(false);
        if(game.IsTie()) {
            container.removeAll();
            frame.repaint();
            container.add(new TiePanel(container, gamePanel, frame));
            frame.revalidate();
        }

        if(game.IsWin()) {
            WinningPanel win = new WinningPanel(container, gamePanel, frame);
            container.removeAll();
            frame.repaint();
            container.add(win);
            frame.revalidate();
        }

    }
}
