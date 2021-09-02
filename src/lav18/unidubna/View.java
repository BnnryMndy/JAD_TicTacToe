package lav18.unidubna;

public class View {
    private static View instance;
    //private
    private View() { }

    public static View getInstance() {
        if (instance == null) instance = new View();

        return instance;
    }

    public void DrawField(){

    }
}
