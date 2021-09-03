package lav18.unidubna;

public class Main {

    public static void main(String[] args) {
        // write your code here
        View view = View.getInstance();
        Controller controller = Controller.getInstance();
        Game game = Game.getInstance();
        view.DrawStartMenu();
        controller.InputNames();

        while (!game.IsWin() && !game.IsTie()){
            view.DrawField();
            controller.InputStep();
        }
        if(game.IsWin()) view.DrawWin();
        if(game.IsTie()) view.DrawTie();
    }
}
