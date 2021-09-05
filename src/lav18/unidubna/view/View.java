package lav18.unidubna.view;

import javax.swing.*;

public class View extends JFrame {
    public View(){
        setSize(600, 600);
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GamePanel gamePanel = new GamePanel();

        getContentPane().add(gamePanel);
    }
}




