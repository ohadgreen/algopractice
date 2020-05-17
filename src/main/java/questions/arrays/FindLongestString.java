package questions.arrays;

public class FindLongestString {


    public static Integer findLongestStretch(String[] letterArray) {

        String prev1 = null;
        String prev2 = null;
        Integer currentStretch = 0;
        Integer longestStretch = 0;

        for (int i = 0; i < letterArray.length ; i++) {
            currentStretch++;
            boolean stopFound = letterArray[i].equals(prev1) && letterArray[i].equals(prev2);
            System.out.println("i: " + letterArray[i] + " currStretch: " + currentStretch + " stop: " + stopFound);
            if (stopFound) {
                if (currentStretch - 3 > longestStretch) {
                    longestStretch = currentStretch - 3;
                }
                currentStretch = 0;
            }
            if (i == letterArray.length - 1) { // last char
                if (currentStretch > longestStretch) {
                    longestStretch = currentStretch;
                }
            }

            prev2 = prev1;
            prev1 = letterArray[i];
        }
        return longestStretch;
    }


}
