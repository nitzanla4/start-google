package week2.wednesday.LambdaStream;

import week2.sunday.ClassesInterfaces.Farm.AnimalType;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

class Item implements Comparable{

    private final String name;
    private final ProductType product;
    private final LocalDate date;
    private final double weight;

    public Item()
    {
        this.name =generateRandomName(5);
        this.product =  ProductType.values()[ThreadLocalRandom.current().nextInt(0, ProductType.values().length)];;
        this.date = generateRandomDate(); // generate date - defensive copy
        this.weight = ThreadLocalRandom.current().nextInt(1000);
    }

        public Item(String name) {
        this.name =name;
        this.product = ProductType.values()[ThreadLocalRandom.current().nextInt(0, ProductType.values().length)];
        this.date = generateRandomDate(); // generate date - defensive copy
        this.weight = ThreadLocalRandom.current().nextInt(1000);
    }

    protected LocalDate getDate() {
        return date;
    }

    protected String getName() {
        return name;
    }

    protected double getWeight() {
        return weight;
    }

    protected ProductType getProduct() {
        return product;
    }

    //Generatetandom name
    private static String generateRandomName(int stringLength) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(stringLength);

        for (int i = 0; i < stringLength; i++) {
            // generate a random number between 0 to AlphaNumericString variable length
            int index = (int) (AlphaNumericString.length() * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString.charAt(index));
        }

        return sb.toString();
    }

    // generate date
    private static LocalDate generateRandomDate() {
        LocalDate startDate = LocalDate.of(2021, 10, 24); //start date
        long start = startDate.toEpochDay();

        LocalDate endDate = LocalDate.of(2024, 10, 31);  //end date
        long end = endDate.toEpochDay();

        long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
        LocalDate res= LocalDate.ofEpochDay(randomEpochDay); // random date between the range
       // Date date = Date.from(res.atStartOfDay(ZoneId.systemDefault()).toInstant());
        return res;
    }


    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", product=" + product +
                ", date=" + date +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

