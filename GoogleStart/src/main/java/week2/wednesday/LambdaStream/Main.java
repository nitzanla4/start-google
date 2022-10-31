package week2.wednesday.LambdaStream;

import java.util.List;

public class Main {
    public static void main(String[] args) {
    Stock stock= new Stock();

    for (int i=0; i<5; i++)
        Stock.generateItemAndAddToList(stock.getItemsList());
    stock.getItemsList().add(new Item("Avi"));
    System.out.println("----STOCK ITEMS--------------------------------");
    Stock.printList(stock.getItemsList());

    List<Item> expiredItems= stock.expiredItems();
    System.out.println("---EXPIRED ITEMS---------------------------------");
    Stock.printList(expiredItems);
    System.out.println("----CLOSEST TO EXPIRE--------------------------------");
    System.out.println(stock.closestItemToExpired());

    System.out.println("----Get one item by name--------------------------------");
    System.out.println(stock.getOneByName("Avi"));

    System.out.println("----Above certain weight--------------------------------");
    System.out.println(stock.aboveCertainWeight(100.0));

    System.out.println("----Product Type Quantity HashMap--------------------------------");
    System.out.println(stock.getProductTypeQuantityHashMap());

    }
}
