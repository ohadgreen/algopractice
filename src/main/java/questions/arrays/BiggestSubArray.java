package questions.arrays;

public class BiggestSubArray {
    /*
    given a numbers array, need to find the biggest sub array of k consecutive numbers
     */

    public static int findBiggestSubArray(int[] numbers, int k) {
        int biggestSubMean = 0;
        int count = 0;
        int tempSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(count < k) {
                tempSum += numbers[i];
                count ++;
            }
            else {
                tempSum += numbers[i];
                tempSum -= numbers[i - k];
                if (tempSum > biggestSubMean) {
                    biggestSubMean = tempSum;
                }
            }

        }
        return biggestSubMean;
    }
}
