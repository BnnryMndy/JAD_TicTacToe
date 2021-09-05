package lav18.unidubna.view;

import lav18.unidubna.controller.GameButtonController;
import lav18.unidubna.model.Game;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    JButton[] button = new JButton[9];
    Game game = Game.getInstance();



    public View(){
        setSize(600, 600);
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        GamePanel gamePanel = new GamePanel(container, this);
        MenuPanel menuPanel = new MenuPanel(container, gamePanel, this);
        container.add(menuPanel);
    }
}




