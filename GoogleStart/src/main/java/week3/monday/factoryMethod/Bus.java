package week3.monday.factoryMethod;

public class Bus implements Vechicle{
    @Override
    public void transport(Passenger passenger) {
        System.out.println("Bus:" + passenger.getName());
    }
}
