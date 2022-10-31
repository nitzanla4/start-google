package week2.sunday.ClassesInterfaces.Farm;

import java.util.concurrent.ThreadLocalRandom;

public class Horse extends AbstractAnimal {
    private final int HORSE_WEIGHT = 150;
    private Horse(Gender gender, int weight) {
        super(gender,weight);
    }

    public  static Horse createHorse(Gender gender, int weight) {return new Horse(gender,weight);}


    @Override
    public void move() {
        System.out.println("Horse- moving");
    }

    @Override
    public Animal mate(Animal partner) {
        if (!super.isMatable(partner)) {
            throw new IllegalArgumentException();
        }

        Gender randomGender = Gender.values()[ThreadLocalRandom.current().nextInt(0, Gender.values().length)];

        return createHorse(randomGender,HORSE_WEIGHT);
    }

}