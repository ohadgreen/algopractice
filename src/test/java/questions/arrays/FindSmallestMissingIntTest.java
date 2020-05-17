package questions.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindSmallestMissingIntTest {
    @Test
    public void simpleArrayTest() {
        int[] testArray = {1, 2, 4};
        int smallest = FindSmallestMissingInt.solution(testArray);
        assertEquals(3, smallest);
    }

    @Test
    public void notSorted() {
        int[] testArray = {5, 2, 0, 1};
        int smallest = FindSmallestMissingInt.solution(testArray);
        assertEquals(3, smallest);
    }

    @Test
    public void negativeArr() {
        int[] testArray = {5, -2, 0, -1};
        int smallest = FindSmallestMissingInt.solution(testArray);
        assertEquals(1, smallest);
    }

    @Test
    public void noGaps() {
        int[] testArray = {1, 2, 3};
        int smallest = FindSmallestMissingInt.solution(testArray);
        assertEquals(4, smallest);
    }

    @Test
    public void allNeg() {
        int[] testArray = {-1, -2};
        int smallest = FindSmallestMissingInt.solution(testArray);
        assertEquals(1, smallest);
    }

}