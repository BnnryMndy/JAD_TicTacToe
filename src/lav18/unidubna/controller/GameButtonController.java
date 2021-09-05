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
    Container container;
    WinningPanel winPanel;
    TiePanel tiePanel;
    JFrame frame;

    private Game game = Game.getInstance();

    public GameButtonController(int buttonID, JButton button, Container container, WinningPanel winPanel, TiePanel tiePanel, JFrame frame) {
        this.buttonID = buttonID;
        this.button = button;
        this.container = container;
        this.winPanel = winPanel;
        this.tiePanel = tiePanel;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        game.Step(buttonID);
        button.setText(game.getField()[buttonID]);
        button.setEnabled(false);
        if(game.IsWin()) {
            container.removeAll();
            frame.repaint();
            container.add(winPanel);
            frame.revalidate();
        }
        if(game.IsTie()) {
            container.removeAll();
            frame.repaint();
            container.add(tiePanel);
            frame.revalidate();
        }
    }
}
