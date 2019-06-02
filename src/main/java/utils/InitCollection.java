package utils;

import java.util.ArrayList;
import java.util.List;

public class InitCollection {

    public static int[] createNumbersArray(int arrayLength) {
        int[] numberArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            numberArray[i] = i;
        }
        return numberArray;
    }

    public static int[] createNumbersArrayFromList(List<Integer> numbersList) {
        int[] numbersArray = new int[numbersList.size()];
        for (int i = 0; i < numbersArray.length; i ++) {
            numbersArray[i] = numbersList.get(i);
        }
        return numbersArray;
    }

    public static List<Integer> createNumbersList(int listLength) {
        List<Integer> numbersList = new ArrayList<Integer>();
        for(int i = 0; i < listLength; i++) {
            numbersList.add(i);
        }
        return numbersList;
    }

    public static List<Integer> removeRandomNumFromList(List<Integer> numbersList) {
        numbersList.remove(RandomGenerator.generateRandomNumberInRange(0, numbersList.size()));
        return numbersList;
    }
}
