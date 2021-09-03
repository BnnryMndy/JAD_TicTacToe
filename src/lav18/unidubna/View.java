package lav18.unidubna;

public class View {
    private static View instance;
    private static Game game = Game.getInstance();
    //private
    private View() { }

    public static View getInstance() {
        if (instance == null) instance = new View();

        return instance;
    }

    public void DrawField(){
        String field =  "1  |" + "2  |" + "3  \n" +
                        " "+ game.getField()[0]+" |" + " "+ game.getField()[1]+" |" + " "+ game.getField()[2]+" \n" +
                        "___|" + "___|" + "___\n" +
                        "4  |" + "5  |" + "6  \n" +
                        " "+ game.getField()[3]+" |" + " "+ game.getField()[4]+" |" + " "+ game.getField()[5]+" \n" +
                        "___|" + "___|" + "___\n" +
                        "7  |" + "8  |" + "9  \n" +
                        " "+ game.getField()[6]+" |" + " "+ game.getField()[7]+" |" + " "+ game.getField()[8]+" \n" ;

        System.out.println(field);
    }
}
