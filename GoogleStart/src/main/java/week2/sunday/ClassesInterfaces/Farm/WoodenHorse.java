package week2.sunday.ClassesInterfaces.Farm;

import java.util.concurrent.ThreadLocalRandom;

public class WoodenHorse implements WoodenStructures{

    private WoodenHorse() {}
    public static WoodenHorse createWoodenHorse() {return new WoodenHorse();}


    @Override
    public void roll() {
        System.out.println("WoodenHorse rolling.. ");
    }

    @Override
    public WoodenStructures replicate() {
        System.out.println("WoodenHorse replicate.. ");
        return createWoodenHorse();
    }

    @Override
    public String toString() {
        return "WoodenHorse{" +
                '}';
    }
}
