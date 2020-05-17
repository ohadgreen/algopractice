package questions.arrays;

import java.util.Arrays;

public class FindSmallestMissingInt {
    public static int solution(int[] A) {
        int smallest = 1;
        Arrays.sort(A);
        int prevInt = 0;
        boolean foundInArray = false;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0 && (A[i] - prevInt) > 1) {
                smallest = prevInt + 1;
                foundInArray = true;
                break;
            }
            else
                prevInt = A[i];
        }
        if (!foundInArray)
            smallest = Math.max(1, A[A.length - 1] + 1);

        return smallest;
    }
}
