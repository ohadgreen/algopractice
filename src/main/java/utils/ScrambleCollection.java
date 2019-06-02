package utils;

import java.util.List;

public class ScrambleCollection {

    public static int[] scrambleNumberListToArray(List<Integer> numbersList) {
        int listSize = numbersList.size();
//        System.out.println("listSize = " + listSize);
        int[] scrambledArray = new int[listSize];

        for (int i = 0; i < listSize; i++) {
            int randomNum = RandomGenerator.generateRandomNumberInRange(0, listSize - i);
            scrambledArray[i] = numbersList.get(randomNum);
            numbersList.remove(randomNum);
        }
        return scrambledArray;
    }
}
