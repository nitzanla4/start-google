package week2.sunday.ClassesInterfaces.Farm;

import week2.sunday.ClassesInterfaces.Farm.Animal;
import week2.sunday.ClassesInterfaces.Farm.Farm;
import week2.sunday.ClassesInterfaces.Farm.Farmer;

import java.util.List;

import static week2.sunday.ClassesInterfaces.Farm.WoodenStructureAdapter.createWoodenStructureAdapter;

public class MainFarm {
    public static void main (String[] args)
    {   testFarm(); }

    public static void testFarm() {
        Farm farm = Farm.createFarm();
        Animal  horseAdapter = createWoodenStructureAdapter(WoodenHorse.createWoodenHorse());
        WoodenStructureAdapter  partnerHorseAdapter = createWoodenStructureAdapter(WoodenHorse.createWoodenHorse());
        horseAdapter.move();
        Animal baby= horseAdapter.mate(partnerHorseAdapter);
        System.out.println(baby+ "baby");



//                farm.acquire();
//                farm.acquire();
//                farm.acquire();

//                System.out.println(farm.toString());

                // ---------------------------------------
//
//                farm.addAnimalToFarm(Cow.createCow(Gender.MALE,70));
//                farm.addAnimalToFarm(Cow.createCow(Gender.FEMALE,70));
//                farm.addAnimalToFarm(Cow.createCow(Gender.MALE,70));
//
//                farm.mate(farm.getAnimalByID(4), farm.getAnimalByID(5));
//                farm.mate(farm.getAnimalByID(5), farm.getAnimalByID(6));
//
//                System.out.println(farm.toString());
//
//                // ---------------------------------------
//
//                PonyHorse pony1 = PonyHorse.createPony(Horse.createHorse(Gender.FEMALE,25));
//                PonyHorse pony2 = PonyHorse.createPony(Horse.createHorse(Gender.MALE,10));
//                Horse horse = Horse.createHorse(Gender.FEMALE,75);
//
//                pony1.ride();
//                pony1.move();
//                pony1.mate(pony2);
//                //pony1.mate(horse); wanted exeption
//
//                Farmer farmer = new Farmer();
//
//                Animal animal5 = farmer.getFarmAnimalById(farm, 5);
//                System.out.println(animal5);
//                farmer.moveAnimal(animal5);
          }
        }

