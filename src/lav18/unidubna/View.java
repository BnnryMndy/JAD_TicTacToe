package lav18.unidubna;

public class View {
    private static final View instance = new View();
    private static Game game = Game.getInstance();
    //private
    private View() { }

    public static View getInstance() {
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
        String message = game.WhoStep() + ", enter position:";
        System.out.println(field + message);
    }

    public void DrawStartMenu(){
        String hello = "Welcome to Anton's ...\n"+
                "████████╗██╗ ██████╗    ████████╗ █████╗  ██████╗    ████████╗ ██████╗ ███████╗\n" +
                "╚══██╔══╝██║██╔════╝    ╚══██╔══╝██╔══██╗██╔════╝    ╚══██╔══╝██╔═══██╗██╔════╝\n" +
                "   ██║   ██║██║            ██║   ███████║██║            ██║   ██║   ██║█████╗  \n" +
                "   ██║   ██║██║            ██║   ██╔══██║██║            ██║   ██║   ██║██╔══╝  \n" +
                "   ██║   ██║╚██████╗       ██║   ██║  ██║╚██████╗       ██║   ╚██████╔╝███████╗\n" +
                "   ╚═╝   ╚═╝ ╚═════╝       ╚═╝   ╚═╝  ╚═╝ ╚═════╝       ╚═╝    ╚═════╝ ╚══════╝\n" +
                "\n\nEnter your names separated by a space:";

        System.out.println(hello);
    }

    public void DrawWin(){

        String pic = "                                 .''.\n" +
                "       .''.             *''*    :_\\/_:     . \n" +
                "      :_\\/_:   .    .:.*_\\/_*   : /\\ :  .'.:.'.\n" +
                "  .''.: /\\ : _\\(/_  ':'* /\\ *  : '..'.  -=:o:=-\n" +
                " :_\\/_:'.:::. /)\\*''*  .|.* '.\\'/.'_\\(/_'.':'.'\n" +
                " : /\\ : :::::  '*_\\/_* | |  -= o =- /)\\    '  *\n" +
                "  '..'  ':::'   * /\\ * |'|  .'/.\\'.  '._____\n" +
                "      *        __*..* |  |     :      |.   |' .---\"|\n" +
                "       _*   .-'   '-. |  |     .--'|  ||   | _|    |\n" +
                "    .-'|  _.|  |    ||   '-__  |   |  |    ||      |\n" +
                "    |' | |.    |    ||       | |   |  |    ||      |\n" +
                " ___|  '-'     '    \"\"       '-'   '-.'    '`      |____\n" +
                "jgs~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";

        String message = "Congratulations! " + game.WhoStep() + " win!\n\nMay be play one more time?\nEnter to play again, write /q to exit\n";

        System.out.println(pic+message);
    }

    public void DrawTie(){
        String pic = "      /^-^\\         /^-----^\\\n" +
                "      / o o \\        V  o o  V\n" +
                "     /   Y   \\        |  Y  |\n" +
                "     V \\ v / V         \\ Q /\n" +
                "       / - \\           / - \\\n" +
                "      /    |           |    \\\n" +
                "(    /     |           |     \\     )\n" +
                " ===/___) ||           || (___\\====\n";

        String message = "Congratulations! You both win!";
        System.out.println(pic+message);
    }


}


