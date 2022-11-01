package week3.monday.factoryMethod;

import java.util.Random;

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

    public static String generateName()
    {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder(5);
        for (int i = 0; i < 5; i++) {
            int index = (int)(AlphaNumericString.length() * Math.random());

            sb.append(AlphaNumericString.charAt(index));
        }

        return sb.toString();
    }


}
