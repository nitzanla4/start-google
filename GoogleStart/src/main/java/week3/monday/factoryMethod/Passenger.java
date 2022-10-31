package week3.monday.factoryMethod;

public class Passenger {
    private String name;
    private Vechicle favoriteVechile;

    public Passenger(String name, Vechicle favoriteVechile) {
        this.name = name;
        this.favoriteVechile = favoriteVechile;
    }

    public String getName() {
        return name;
    }

    public Vechicle getFavoriteVechile() {
        return favoriteVechile;
    }
}
