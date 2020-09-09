package questions.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTwoNumberSumTest {

    @Test
    public void findIfSumExists() {
        int[] testArray = {1, 7, 4, 9, 6, 8, 2, 13, 14};
        int sum = 12;
        boolean exists = FindTwoNumberSum.findIfArrayContainsTwoNumberSum(sum, testArray);
        assertTrue(exists);
    }
    @Test
    public void findIfSumExistsFalse() {
        int[] testArray = {1, 12, 5, 19, 14, 10, 3};
        int sum = 14;
        boolean exists = FindTwoNumberSum.findIfArrayContainsTwoNumberSum(sum, testArray);
        assertFalse(exists);
    }
}