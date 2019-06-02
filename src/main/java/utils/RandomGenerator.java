package utils;

import java.util.Random;

public class RandomGenerator {

    public static int generateRandomNumberInRange(int lower, int upper) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(upper) + lower;
//        System.out.println("Random number generated is : " + randomInt);
        return randomInt;
    }
}
