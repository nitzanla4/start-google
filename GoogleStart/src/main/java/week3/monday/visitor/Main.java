package week3.monday.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Appliance> appliances=new ArrayList<>();
        appliances.add(new Asset(1, "Avi", 5.5));
        appliances.add(new Group(2,50));
        appliances.add(new User(10,"Shlomi", " 123456"));

        exportToJson exportToJson= new exportToJson();

        for (Appliance appliance: appliances)
            appliance.accept(exportToJson);
    }
}
