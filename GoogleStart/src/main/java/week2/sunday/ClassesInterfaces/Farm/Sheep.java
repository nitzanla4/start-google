package week2.sunday.ClassesInterfaces.Farm;

import java.util.concurrent.ThreadLocalRandom;

public class Sheep extends AbstractAnimal {
    private final int SHEEP_WEIGHT = 90;

    private Sheep(Gender gender, int weight) {
        super(gender, weight);
    }

    public static Sheep createSheep(Gender gender,int weight) {
        return new Sheep(gender,weight);
    }

    @Override
    public void move() {
        System.out.println("Sheep- moving");
    }


    @Override
    public Animal mate(Animal partner) {
        if (!super.isMatable(partner)) {
            throw new IllegalArgumentException();
        }

        Gender randomGender = Gender.values()[ThreadLocalRandom.current().nextInt(0, Gender.values().length)];

        return createSheep(randomGender,SHEEP_WEIGHT);
    }

}
