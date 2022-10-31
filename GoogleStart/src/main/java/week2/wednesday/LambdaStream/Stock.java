package week2.wednesday.LambdaStream;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class Stock {

    List<Item> itemsList;

    public Stock() {
        this.itemsList = new ArrayList<>();
    }

    protected List<Item> getItemsList() {
        return itemsList;
    }

    public static void generateItemAndAddToList(List<Item> itemsList) {
        itemsList.add(new Item());
    }

    protected List<Item> expiredItems() {
        List<Item> itemsExpired = itemsList.stream().filter(item -> item.getDate().isBefore(LocalDateTime.now().toLocalDate())).collect(Collectors.toList());
        printList(itemsExpired);
        return itemsExpired;
    }

    protected Item closestItemToExpired() {
        //reomove all expired items
        List<Item> expiredList = this.expiredItems();
        for (Item item : expiredList)
            this.getItemsList().remove(item);
        Item item= itemsList.stream().sorted().findFirst().get();
        return item;
    }

    protected List<String> sortedAlphbetically(double weight){
        return itemsList.stream().filter(item -> item.getWeight() > weight).map(Item::getName).collect(Collectors.toList());}

    protected Item getOneByName(String name)
    {
        return itemsList.stream().filter(item -> item.getName().equals(name.toString()))
                .findFirst().orElse(null);
    }

    protected List<String> aboveCertainWeight(double weight)
    {
        return itemsList.stream().filter(item -> item.getWeight() > weight)
            .map(Item::getName).collect(Collectors.toList());
    }

    protected Map<ProductType, Integer> getProductTypeQuantityHashMap() {
        return itemsList.stream().collect(groupingBy(Item::getProduct, summingInt(e -> 1)));
    }

 protected static  void printList(List<Item> list)
 {
     for (Item item :list) {
         System.out.println(item);
         System.out.println();
     }
 }

}
