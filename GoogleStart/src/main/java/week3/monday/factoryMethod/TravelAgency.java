package week3.monday.factoryMethod;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static week3.monday.factoryMethod.VehicleFactory.*;

public class TravelAgency {
    private static final int BUSES=4; //4;
    private static final int TAXI=8; //8
    private static final int BOATS=3; //3
    private static final int PLANES=1;

   public static Map<VehicleType,Integer> vehicleTypeMap;
   public static Map<VehicleType,List<Vechicle>> vehiclesListByType= new HashMap<>(); // key-type, value- list of vehicles with the same type

    public static Map<VehicleType, Integer> getVehicleTypeMap() {
        return vehicleTypeMap;
    }

    public static Map<VehicleType, List<Vechicle>> getVehiclesListByType() {
        return vehiclesListByType;
    }


    private static Map<Passenger, Vechicle> passengerVehicleMap = new HashMap<>();
   private void createVehicleMapSupply()
   {
       this.vehicleTypeMap = new HashMap<>();
       vehicleTypeMap.put(VehicleType.BUS,BUSES);
       vehicleTypeMap.put(VehicleType.TAXI,TAXI);
       vehicleTypeMap.put(VehicleType.BOAT,BOATS);
       vehicleTypeMap.put(VehicleType.PLANE,PLANES);
   }

    public TravelAgency() {
        createVehicleMapSupply();
        printVehicleTypeMap();
        System.out.println("--------------------------");
        generateVehicles(vehicleTypeMap);
        printVehicleListTypeMap();
    }

    public Vechicle vechicleSupply(@NotNull Passenger passenger)
    {
        Vechicle favorite= passenger.getFavoriteVechile();
        if (getVehiclesListByType()!= null && getVehiclesListByType().get(favorite).size()>0) //we have avilable favorite vehicle
        {
            Vechicle vechicle1= (Vechicle) vehiclesListByType.get(favorite);
            vehiclesListByType.remove(vechicle1);
            passengerVehicleMap.put(passenger,vechicle1);
            return vechicle1;
        }
        else
        {
            VehicleType vt= chooseAvilableRandomVehicle().get();
            Vechicle vechicle2= (Vechicle) vehiclesListByType.get(vt);
            vehiclesListByType.remove(vechicle2);
            passengerVehicleMap.put(passenger,vechicle2);
            return vechicle2;
        }

    }


    public void printVehicleTypeMap()
    {
        for (VehicleType type: vehicleTypeMap.keySet())
        {
               System.out.println("The type: " + type);
        }
    }

    public static boolean isMatchSucced (Vechicle vt1, Vechicle vt2)
    {
        if (vt1==vt2) return  true;
        else return false;
    }
    public void printVehicleListTypeMap()
    {
        for (VehicleType type: vehicleTypeMap.keySet())
        {
            System.out.println("The type: " + type);
            List<Vechicle> list= vehiclesListByType.get(type);
            int liseSize;
            if (list ==null)
            {liseSize=0;}
            else
            {
                liseSize=list.size();
                printList(list);
                System.out.println();
            }


        }
    }


    public void printList(List<Vechicle> list)
    {
        for (int i=0; i<list.size(); i++)
            System.out.print(list.get(i)+ "   ");
    }
}

