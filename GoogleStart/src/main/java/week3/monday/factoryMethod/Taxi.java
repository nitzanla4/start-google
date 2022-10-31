package week3.monday.factoryMethod;

public class Taxi implements Vechicle {
    @Override
    public void transport(Passenger passenger) {
        System.out.println("Taxi:" + passenger.getName());
    }
}
