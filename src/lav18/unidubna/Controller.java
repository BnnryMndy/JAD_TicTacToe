package lav18.unidubna;

import java.util.Scanner;

public class Controller {
    private Scanner in;
    private String input;
    private Game game;
    private static final Controller instance = new Controller();

    private Controller(){
        in = new Scanner(System.in);
        game = Game.getInstance();
    }

    public static Controller getInstance(){
        return instance;
    }

    public void InputStep(){
        input = in.nextLine();
        game.Step(Integer.parseInt(input) - 1);
    };

    public void InputNames(){
        input = in.nextLine();
        game.AddPlayers(input.split(" ")[0],input.split(" ")[1]);
    };

    public int InputMenu(){
        input = in.nextLine();
        if(input.trim() == "/q") return 0;

        game.NewGame();
        return 1;

    };
}
