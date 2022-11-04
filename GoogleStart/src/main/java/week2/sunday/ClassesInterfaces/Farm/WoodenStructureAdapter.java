package week2.sunday.ClassesInterfaces.Farm;

import java.util.concurrent.ThreadLocalRandom;

public class WoodenStructureAdapter implements  Animal{
    static WoodenHorse woodenHorse;

    private WoodenStructureAdapter(WoodenHorse woodenHorse) {this.woodenHorse = woodenHorse;}

    public static WoodenStructureAdapter createWoodenStructureAdapter(WoodenHorse woodenHorse)
    {
        return new WoodenStructureAdapter(woodenHorse);
    }

    public static WoodenHorse getWoodenHorse() {return woodenHorse;}
//-------------------------------------------------------------------------------------------------
    @Override
    public Animal mate(Animal partner) {
        if (!(partner instanceof WoodenStructureAdapter)) {
            throw new IllegalArgumentException(" not matable");
        }
        return createWoodenStructureAdapter((WoodenHorse) woodenHorse.replicate());
    }

    @Override
    public void move() {woodenHorse.roll();}

    @Override
    public String toString() {
        return "WoodenStructureAdapter{}";
    }
}
