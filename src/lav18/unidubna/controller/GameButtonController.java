package lav18.unidubna.controller;

import lav18.unidubna.model.Game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameButtonController implements ActionListener {
    private int buttonID;
    private JButton button;

    private Game game = Game.getInstance();
    public GameButtonController(int buttonID, JButton button){
        this.buttonID = buttonID;
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        game.Step(buttonID);

        button.setText(game.getField()[buttonID]);
        button.setEnabled(false);
    }
}
