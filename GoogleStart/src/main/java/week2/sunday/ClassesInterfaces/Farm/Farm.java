package week2.sunday.ClassesInterfaces.Farm;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Farm {
    protected List<Animal> farmsAnimals;

    private Farm()
    {
        farmsAnimals=new ArrayList<>();
    }

    protected static Farm createFarm() {return new Farm();}

    public void acquire() {
        addAnimalToFarm(generateRandomAnimal());
    }

    public void addAnimalToFarm(Animal animal) {
        farmsAnimals.add(animal);
    }

    public Animal generateRandomAnimal() {
        AnimalType type = AnimalType.values()[ThreadLocalRandom.current().nextInt(0, AnimalType.values().length)];
        Gender randomGender = Gender.values()[ThreadLocalRandom.current().nextInt(0, Gender.values().length)];
        int randomWeight = ThreadLocalRandom.current().nextInt(0, 100);

        switch (type) {
            case Sheep:
                return Sheep.createSheep(randomGender,randomWeight);
            case Cow:
                return Cow.createCow (randomGender,randomWeight);
            default:
                return Horse.createHorse(randomGender,randomWeight);
        }
    }



    protected void mate(Animal animal1, Animal animal2)
    {
        try
        {
            Animal baby= (Animal) animal1.mate(animal2);
            farmsAnimals.add(baby);
        }
        catch (IllegalArgumentException ex) { System.out.println("Not able to mate");}
    }



    public Animal getAnimalByID(int id) {
        return (Animal) farmsAnimals.get(id);
    }

    @Override
    public String toString() {
        String string = "Farm{animals = \n";

        for (Animal animal : farmsAnimals) {
            string += animal.toString() + "\n";
        }
        string += "}";

        return string;
    }
}

