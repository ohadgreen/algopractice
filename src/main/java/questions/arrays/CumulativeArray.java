package questions.arrays;

public class CumulativeArray {

    /*
    [1, 3, 5, 10, 2, 4, 20, 7]
    [0 , 1, 4, 9, 19, 21, 25, 45]

     */
    public static int[] runningCumArray(int[] numbersArray) {
        int[] cumArray = new int[numbersArray.length];
        if (numbersArray.length == 0) throw new IllegalStateException();

        int prevSum = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            cumArray[i] = prevSum;
            prevSum += numbersArray[i];
        }


        return cumArray;
    }
}

