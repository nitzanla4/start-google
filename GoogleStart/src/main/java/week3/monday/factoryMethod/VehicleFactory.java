package week3.monday.factoryMethod;

import jdk.jshell.execution.Util;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import static week3.monday.factoryMethod.TravelAgency.getVehiclesListByType;

public class VehicleFactory {

    private static VehicleFactory instance;

    public static VehicleFactory getInstance(){
        if(instance==null){
            instance = new VehicleFactory();
        }
        return instance;
    }

        public static Vechicle createVehicle(VehicleType type){
            switch (type){
                case PLANE:
                    return new Plane();
                case BUS:
                    return new Bus();
                case TAXI:
                    return new Taxi();
                case BOAT:
                    return new Boat();
                default:
                    throw new IllegalArgumentException(String.format("Vehicle type not supported: %s", type));
            }
        }

        public static Vechicle generateRandomVehicle() {
            VehicleType vType= VehicleType.values()[ThreadLocalRandom.current().nextInt(0, VehicleType.values().length)];
            return createVehicle(vType);
        }


    public static Optional<VehicleType> chooseAvilableRandomVehicle() {
      List<VehicleType> avilableTypes= new ArrayList<>();
        for (VehicleType type: TravelAgency.getVehicleTypeMap().keySet())
        {
            if (getVehiclesListByType().get(type).size() >0 ) //checking avilabilty
                avilableTypes.add(type);
        }

        if (avilableTypes.size()==0)
            return Optional.empty();
        else
        {
            int random = ThreadLocalRandom.current().nextInt(4);;
            return Optional.ofNullable(avilableTypes.get(random));
        }
    }



    public static void generateVehicles(Map<VehicleType, Integer> vehicleTypeMap) {
        VehicleFactory vehicleFactory = VehicleFactory.getInstance();

        for (VehicleType type : vehicleTypeMap.keySet()) {
            for (int i = 0; i < vehicleTypeMap.get(type); i++) {
                Vechicle newVehicle = vehicleFactory.createVehicle(type);
                getVehiclesListByType().computeIfAbsent(type, k -> new ArrayList<>()).add(newVehicle);
            }
        }

        //return vehicles;
    }
}




