package week1.basics.GeneralProgEx.FOOTBALL;

import java.util.*;


public class NameGenerator {
    //Dictionaries
    final static List<String> dicRishon = new ArrayList<>(Arrays.asList("Moshe", "Avi", "Yossi", "Dany", "Evi", "Polly", "Assaf","Ran",
            "Gabriel", "Natan", "Aviv", "Daniel", "Roni", "Lior", "Yaniv"));
    final static List<String> dicBarcelona = new ArrayList<>(Arrays.asList("Robert", "Gavi", "Raphinha", "Pedry", "Jules", "Frenki", "Jong","Lewandow",
            "Pena", "Stegen", "Pique", "Araujo", "Bellerin", "Alonso", "Alba"));

    final static List<String> dicRealmadrid = new ArrayList<>(Arrays.asList("Alaba", "Vallejo", "Nacho", "Odriozola", "Lucas", "Rudiger", "Mendy","Kroos",
            "Modric", "Camavinga", "Valverde", "Tchouameni", "Hazard", "Benzema", "ASensio"));
//-------------------------------------------------------------------------------------------------
    private List namesList;

    //constructor
    public NameGenerator(List other) { namesList= other;}

    //getter
    public List getNamesSet() {return namesList;}

    // static factory method
    public static NameGenerator createWantedDic (String dicName)
    {
        switch (dicName)
        {
            case "dicBarcelona":
                return new NameGenerator(dicBarcelona);
            default: return new NameGenerator(dicRishon);
        }

    }


}



