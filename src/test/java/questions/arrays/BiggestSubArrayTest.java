package questions.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BiggestSubArrayTest {

    @Test
    void findBiggestSubArray() {
        int[] numbers = {7, 3, 4, 1, 8, 9, 2, 5, 6};
        int k = 3;
        int biggestSubArray = BiggestSubArray.findBiggestSubArray(numbers, k);

        assertEquals(19, biggestSubArray);
    }

    @Test
    void findBiggestSubArray2() {
        int[] numbers = {7, 3, 4, 1, 8, 9, 2, 15, 6};
        int k = 3;
        int biggestSubArray = BiggestSubArray.findBiggestSubArray(numbers, k);

        assertEquals(26, biggestSubArray);
    }
}