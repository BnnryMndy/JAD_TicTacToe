package lav18.unidubna.model;

public class Player {
    private String name;
    private int rating;
    private String sign;

    public Player(String name, String sign) {
        this.name = name;
        this.sign = sign;
        this.rating = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRating(int rating) {
        this.rating += rating;
    }

    public String getSign() {
        return sign;
    }

    @Override
    public String toString() {
        return "Player " +
                "'" + name + '\'' +
                " has rating " + rating +
                '.';
    }
}
