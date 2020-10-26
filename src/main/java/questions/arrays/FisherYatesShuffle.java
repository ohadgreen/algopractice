package questions.arrays;

import java.util.concurrent.ThreadLocalRandom;

public class FisherYatesShuffle {
    public static void shuffleArray(int[] numbers) {
        int length = numbers.length;

        for (int i = 0; i < numbers.length; i++) {
            int randomIndex = ThreadLocalRandom.current().nextInt(i, length);
            int chosen = numbers[randomIndex];
            System.out.println("round " + (i + 1) + " rand = " + randomIndex + " : " + chosen);
            numbers[randomIndex] = numbers[i];
            numbers[i] = 0;
        }
    }
}

// 1, 2, 3, 4, 5    --> 4
// 4, 2, 3, 1, 5    --> 3
// 4, 3, 2, 1, 5
