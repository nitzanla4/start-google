package Utils;

import java.util.Random;

public class RandomNumber {
    public static int getRandomNumber() {
        Random rand = new Random();
        // Generate random integers in range 0 to 99
        int rNum = rand.nextInt(100);
        return rNum;
    }
}
