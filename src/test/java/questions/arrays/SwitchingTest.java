package questions.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchingTest {

    @Test
    public void simpleArrayTest() {
        int[] testArray = {1, 2, 1, 2, 3, 4, 3, 5};
        int longest = Switching.switchingSlice(testArray);

        assertEquals(4, longest);
    }


    @Test
    public void shortArrTest() {
        int[] testArray = {1, 2};
        int longest = Switching.switchingSlice(testArray);

        assertEquals(1, longest);
    }
}