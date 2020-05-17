package questions.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLongestStringTest {
    @Test
    void twoStretchTest() {
        String[] testArray = {"b", "b", "a", "a", "a", "b", "a", "b", "a", "a", "a"};
        Integer longestStretch = FindLongestString.findLongestStretch(testArray);
        assertEquals(3, longestStretch);
    }

    @Test
    void stopAtEndTest() {
        String[] testArray = {"b", "b", "a", "a", "a"};
        Integer longestStretch = FindLongestString.findLongestStretch(testArray);
        assertEquals(2, longestStretch);
    }

    @Test
    void anotherArrTest() {
        String[] testArray = {"a", "b", "a", "b", "b", "a", "b", "a"};
        Integer longestStretch = FindLongestString.findLongestStretch(testArray);
        assertEquals(8, longestStretch);
    }
}