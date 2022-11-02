package week2.sunday.ClassesInterfaces.Farm;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class AbstractAnimal implements Animal {
    private static final AtomicInteger count = new AtomicInteger(0);
    protected Gender gender = null;
    protected int weight;
    protected final int id;

    public AbstractAnimal(Gender gender, int weight) {
        this.gender=gender;
        this.id = count.incrementAndGet();
        this.weight = weight;
    }

    protected Gender getGender() {
        return gender;
    }

    protected int getWeight() {
        return weight;
    }

    protected int getId() {
        return id;
    }

    public boolean isMatable(Animal partner) {
        AbstractAnimal animal = (AbstractAnimal) partner;

        return animal.getGender() != this.getGender() &&
                animal.getClass() == this.getClass();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "ID: " + getId() +
                ", Gender: " + getGender().toString() +
                ", Weight: " + getWeight() +
                "}";
    }

}
