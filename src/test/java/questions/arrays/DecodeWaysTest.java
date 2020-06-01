package questions.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeWaysTest {

    @Test
    void test1234() {
        char[] testArray = {'1','2','3','4'};
        int result = DecodeWays.countDecodeWays(testArray);
        assertEquals(3, result);
    }

}