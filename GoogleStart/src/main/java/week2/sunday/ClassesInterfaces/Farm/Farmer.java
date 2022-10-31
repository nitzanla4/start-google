package week2.sunday.ClassesInterfaces.Farm;

import java.util.ArrayList;

public class Farmer {

    public void moveAnimal(Animal animal) {
        animal.move();
    }

    public Animal getFarmAnimalById(Farm farm, int id) {
        return farm.getAnimalByID(id);
    }
}
