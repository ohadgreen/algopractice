package questions.arrays;

public class Switching {
    public static int switchingSlice(int[] A) {
        int longestSlice = 1;
        int currentSlice = 1;

        if (A.length <= 2) {
            return 1;
        }

        else {
            for (int i = 2; i < A.length ; i++) {
                if (A[i] == A[i - 2]) {
                    if (currentSlice == 1) {
                        currentSlice = 3;
                    }
                    else {
                        currentSlice ++;
                    }
                    if (currentSlice > longestSlice) {
                        longestSlice = currentSlice;
                    }
                }
                else {
                    currentSlice = 1;
                }
            }
        }
        return longestSlice;
    }
}
