package week3.monday.factoryMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TravelAgency {
    private static final int BUSES=4;
    private static final int TAXI=8;
    private static final int BOATS=3;
    private static final int PLANES=1;
    private static final int TOTAL_VEHICLE=BUSES+TAXI+BOATS+PLANES;

   private Map<VehicleType,Integer> vehicleTypeMap;
   private Map<VehicleType,List<Vechicle>> vehicles;


   private void VehicleMapSupply()
   {
       this.vehicleTypeMap = new HashMap<>();
       vehicleTypeMap.put(VehicleType.BUS,BUSES);
       vehicleTypeMap.put(VehicleType.TAXI,TAXI);
       vehicleTypeMap.put(VehicleType.BOAT,BOATS);
       vehicleTypeMap.put(VehicleType.PLANE,PLANES);
   }

    private void generateVehicles(Map<VehicleType, Integer> vehicleTypeMap) {
        VehicleFactory vehicleFactory = VehicleFactory.getInstance();

        for (VehicleType type : vehicleTypeMap.keySet()) {
            for (int i = 0; i < vehicleTypeMap.get(type); i++) {
                Vechicle newVehicle = vehicleFactory.createVehicle(type);
                vehicles.computeIfAbsent(type, k -> new ArrayList<>()).add(newVehicle);
            }
        }
    }


    public TravelAgency() {


    }
}
