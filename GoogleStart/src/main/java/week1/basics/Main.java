package week1.basics;

import java.util.*;

public class Main {

    static final int NumOfUsers=7;

    public static void dividedNum(int[] arr, int num) {
        //for
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % num == 0) System.out.println(arr[i] + " ");
        }

        //for-each
        for (int x : arr) if (x % num == 0) System.out.println(x + " ");

        //while
        int i = 0;
        while (i < arr.length) {
            if (arr[i] % num == 0) System.out.println(arr[i] + " ");
            i++;
        }
    }

    //Random String
    public static String generateRandomName(int stringLength) {
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

    public static int generateRandomNumber() {
        Random rand = new Random();
        // Generate random integers in range 0 to 999
        int rNum = rand.nextInt(1000);
        return rNum;
    }

    public static void insertToHashMap(HashMap map) {
        Boolean flag = false;
        for (int i = 0; i < NumOfUsers; i++) {
            map.put(i + 1, new User(generateRandomName(8), generateRandomNumber(), flag));
            flag = !flag;
        }
        printHashMap(map);
    }

    public static void printHashMap(HashMap map) {
        for (int i = 0; i < NumOfUsers; i++) {
            System.out.println(map.get(i));
        }

    }

    public static void insertToList(List list) {
        Boolean flag = false;
        for (int i = 0; i < NumOfUsers; i++) {
            list.add(new User(generateRandomName(8), generateRandomNumber(), flag));
            flag = !flag;
        }
        list.add(new User(generateRandomName(8), 4, flag)); // for testing
        printList(list);
    }


    public static void printList(List list) {
        for (int i = 0; i < NumOfUsers; i++) {
            System.out.println(list.get(i));
        }

    }


    public static void main(String[] args) {
        //func1
//        int[] arr= {1,2,3,4,5,6,7,8};
//        int num=3;
//        dividedNum(arr,num);
//
// func2 -HashMap
//        HashMap<Integer,User> map = new HashMap<>();
//        insertToHashMap(map);


//func 3- List of users
        List<User> list = new ArrayList<>();
        insertToList(list);
        int id=4;

        System.out.println("Testing    " +list.get(id));
        //how many users are activated
        int count=0;
        for (int i = 0; i <NumOfUsers ; i++) { if(list.get(i).isActivated()) count++; }
        System.out.println("Count:  "+ count);
    }
}
