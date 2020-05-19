package questions.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightBulbsTest {

    @Test
    void simpleTest1() {
        int[] testArray = {1, 2, 4, 3};
        int lightCount = LightBulbs.lightCount(testArray);
        assertEquals(3, lightCount);
    }

    @Test
    void simpleTest123() {
        int[] testArray = {1, 2, 3};
        int lightCount = LightBulbs.lightCount(testArray);
        assertEquals(3, lightCount);
    }

    @Test
    void simpleTest321() {
        int[] testArray = {3, 2, 1};
        int lightCount = LightBulbs.lightCount(testArray);
        assertEquals(1, lightCount);
    }

}