package week2.sunday.ClassesInterfaces.Farm;

public class PonyHorse implements Animal {
    private final Horse horse;

    private PonyHorse(Horse horse) {
        this.horse = horse;
    }

    public static PonyHorse createPony(Horse h)
    { return new PonyHorse(h);}

    public int getId() {return  horse.getId();}


    public Gender getGender() {
        return horse.getGender();
    }

    public void move() {horse.move(); }

    public Animal mate(Animal partner) {
        if (partner.getClass() == this.getClass()) {
            partner = ((PonyHorse) partner).horse;
        }
        System.out.println("babyPony was created");
        return horse.mate(partner);
    }

    public void ride() {
        System.out.println("walk walk walk !!!");
    }
}
