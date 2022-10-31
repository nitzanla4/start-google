package week3.monday.factoryMethod;

public class Boat implements Vechicle{

    @Override
    public void transport(Passenger passenger) {
        System.out.println("Boat:" + passenger.getName());
    }
}
