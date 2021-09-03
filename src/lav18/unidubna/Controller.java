package lav18.unidubna;

import java.util.Scanner;

public class Controller {
    private Scanner in;
    private String input;
    private Game game;
    private static Controller instance;

    private Controller(){
        in = new Scanner(System.in);
        game = Game.getInstance();
    }

    public static Controller getInstance(){
        if(instance == null)  instance = new Controller();
        return instance;
    }

    public void InputStep(){
        input = in.nextLine();
        game.Step(Integer.parseInt(input));
    };

    public void InputNames(){
        input = in.nextLine();
        game.AddPlayers(input.split(" ")[0],input.split(" ")[1]);
    };

    public void InputMenu(){
        input = in.nextLine();
        if(input != "/q") game.NewGame();

    };
}
