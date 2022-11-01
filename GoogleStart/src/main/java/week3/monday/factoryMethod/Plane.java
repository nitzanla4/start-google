package week3.monday.factoryMethod;

public class Plane implements Vechicle{
    @Override
    public void transport(Passenger passenger) {
        System.out.println("Plane:" + passenger.getName());
    }

    @Override
    public String toString() {
        return "Plane";
    }
}
