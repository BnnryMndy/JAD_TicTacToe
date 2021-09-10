package lav18.unidubna.model;

public class Game {
    private static Game instance = new Game();
    private Player playerX;
    private Player playerO;
    private Player currentPlayer;
    private String[] field = new String[9];

    private Game() {
    }

    public String[] getField() {
        return field;
    }

    public static Game getInstance() {
        return instance;
    }

    public void AddPlayers(String player1Name, String player2Name){
        playerX = new Player(player1Name, "x");
        playerO = new Player(player2Name, "o");

        NewGame();
    }

    public void NewGame(){
        for (int i = 0; i < 9; i++) {
            field[i] = " ";
        }

        currentPlayer = playerX;
    }

    public int Step(int fieldNum){
        if(field[fieldNum] != " ") return -1;

        field[fieldNum] = currentPlayer.getSign();
        if (IsWin()) return 1;
        if (IsTie()) return 2;
        SwapPlayers();
        return 0;
    }

    private void SwapPlayers(){
        if (currentPlayer == playerX) currentPlayer = playerO;
        else currentPlayer = playerX;
    }

    public String WhoStep(){
        return currentPlayer.getName();
    }

    public boolean IsWin(){
        //TODO: make it right

        //horizontal conditions
        if(field[0].equals(field[1]) & field[1].equals(field[2]) & !field[0].equals(" ")) return true;
        if(field[3].equals(field[4]) & field[4].equals(field[5]) & !field[3].equals(" ")) return true;
        if(field[6].equals(field[7]) & field[7].equals(field[8]) & !field[6].equals(" ")) return true;

        //vertical conditions
        if(field[0].equals(field[3]) & field[3].equals(field[6]) & !field[0].equals(" ")) return true;
        if(field[1].equals(field[4]) & field[4].equals(field[7]) & !field[1].equals(" ")) return true;
        if(field[2].equals(field[5]) & field[5].equals(field[8]) & !field[2].equals(" ")) return true;

        //diagonal conditions
        if(field[0].equals(field[4]) & field[4].equals(field[8]) & !field[0].equals(" ")) return true;
        if(field[2].equals(field[4]) & field[4].equals(field[6]) & !field[2].equals(" ")) return true;

        return false;
    }
    
    public boolean IsTie(){
        for (int i = 0; i < field.length; i++) {
            if (field[i].equals(" ")) return false;
        }
        // if(IsWin()) return false;
        return true;
    }
}
