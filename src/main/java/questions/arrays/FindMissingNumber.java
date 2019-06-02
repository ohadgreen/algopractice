package questions.arrays;

import utils.InitCollection;
import utils.PrintUtil;
import utils.ScrambleCollection;

import java.util.List;

public class FindMissingNumber {
    public static int findMissingNumberInArray(int arraySize) {
        Integer missingNumber = null;

        int[] numbersArrayMissingOne = getNumbersArrayMissingOne(arraySize);
        System.out.println("numbers array missing one:");
        PrintUtil.printArray(numbersArrayMissingOne);
        System.out.println();

        Integer[] tempArray = new Integer[arraySize]; // one bigger than namo
        createOrderedArray(numbersArrayMissingOne, tempArray);
        System.out.println("tmep array:");
        PrintUtil.printArray(tempArray);
        System.out.println();

        for (int i = 0; i < tempArray.length; i++) {
            if ((tempArray[i] ==  null)){
                missingNumber = i;
                System.out.println("missing number is " + missingNumber);
                break;
            }
        }
        return missingNumber;
    }

    private static void createOrderedArray(int[] numbersArrayMissingOne, Integer[] tempArray) {
        for (int i = 0; i < numbersArrayMissingOne.length; i++) {
            Integer nextNum = numbersArrayMissingOne[i];
            tempArray[nextNum] = nextNum;
//            System.out.println("nextNum = " + nextNum);
        }
    }

    private static int[] getNumbersArrayMissingOne(int arraySize) {
        List<Integer> numbersList = InitCollection.createNumbersList(arraySize);
        InitCollection.removeRandomNumFromList(numbersList);
        int[] scrambledNumbersArray = ScrambleCollection.scrambleNumberListToArray(numbersList);
        return scrambledNumbersArray;
    }
}
