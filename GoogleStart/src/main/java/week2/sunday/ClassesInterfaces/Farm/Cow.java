package week2.sunday.ClassesInterfaces.Farm;

import java.util.concurrent.ThreadLocalRandom;

public class Cow extends AbstractAnimal{
    private final int COW_WEIGHT = 100;
    private Cow(Gender gender, int weight) {
        super(gender, weight);
    }

    protected static Cow createCow (Gender gender, int weight)
            {return new Cow(gender,weight);}


    @Override
    public void move() {
        System.out.println("Cow is moving...");
    }


    @Override
    public Animal mate(Animal partner) {
        if (!super.isMatable(partner)) {
            throw new IllegalArgumentException();
        }

        Gender randomGender = Gender.values()[ThreadLocalRandom.current().nextInt(0, Gender.values().length)];

        return createCow(randomGender, COW_WEIGHT);
    }







}
