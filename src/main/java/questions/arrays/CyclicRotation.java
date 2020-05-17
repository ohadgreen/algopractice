package questions.arrays;

public class CyclicRotation {
    public static String[] switchArray(String[] inputArray, Integer stepsMove) {

        int arrLength = inputArray.length;
        String[] shiftedArray = new String[arrLength];
        for (int i = 0; i < arrLength; i++) {
            if (i < (arrLength - stepsMove)) {
            shiftedArray[i + stepsMove] = inputArray[i];
            }
            else {
            shiftedArray[stepsMove - (arrLength - i)] = inputArray[i];
            }
        }

        return shiftedArray;
    }
}
