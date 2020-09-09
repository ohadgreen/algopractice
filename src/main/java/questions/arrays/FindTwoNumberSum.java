package questions.arrays;

import java.util.Arrays;

public class FindTwoNumberSum {
    
    public static boolean findIfArrayContainsTwoNumberSum(int sum, int[] numbers) {
        boolean found = false;
        Arrays.sort(numbers);
        int start = 0;
        int end = numbers.length - 1;

        Arrays.stream(numbers).forEach(n -> System.out.print(n + ", "));
        System.out.println();

        while (start < end) {
            int tempSum = Integer.valueOf(numbers[start]) + Integer.valueOf(numbers[end]);
            System.out.println(numbers[start] + "+" + numbers[end] + "=" + tempSum);
            if (tempSum == sum) {
                found = true;
                break;
            }
            if (tempSum < sum) {
                start++;
            }
            else {
                end--;
            }
        }
        return found;
    }
}
