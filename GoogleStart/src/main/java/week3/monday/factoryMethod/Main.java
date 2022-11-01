package week3.monday.factoryMethod;

import java.util.HashMap;
import java.util.Map;

import static week3.monday.factoryMethod.TravelAgency.isMatchSucced;
import static week3.monday.factoryMethod.VehicleFactory.generateRandomVehicle;

public class Main {
    public static void main(String[] args)
    {

        VehicleFactory vf= VehicleFactory.getInstance();
        TravelAgency agency=new TravelAgency();


        Map<Passenger, Vechicle> testing= new HashMap<>();
        Passenger passenger = null;
        for (int i = 0; i < 15; i++) {
            passenger = new Passenger(Passenger.generateName(),generateRandomVehicle());
            testing.put(passenger, agency.vechicleSupply(passenger));

            System.out.println("Passenger fav:" + passenger.getFavoriteVechile()+ "  "+
                    " Ageng supply     "+ testing.get(passenger));


            if (isMatchSucced(testing.get(passenger), passenger.getFavoriteVechile()))
                  System.out.println("Well done");
            else  System.out.println("Do better");
        }



    }


}
