package questions.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElementTest {

    @Test
    void nextGreaterElementSimpleTest() {
        int[] testArray = {8, 5, 3, 1, 2, 9, 4};
        NextGreaterElement.nextGreaterElement(testArray);
    }

    @Test
    void ngeAscendingTest() {
        int[] testArray = {1, 5, 6, 9, 10};
        NextGreaterElement.nextGreaterElement(testArray);
    }

    @Test
    void ngeDescendingTest() {
        int[] testArray = {9, 7, 5, 1};
        NextGreaterElement.nextGreaterElement(testArray);
    }
}