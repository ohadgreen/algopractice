package questions.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CumulativeArrayTest {

    @Test
    public void regularNumbersCum() {
        int[] testArray = new int[] {1, 3, 5, 10, 2, 4, 20, 7};
        System.out.println(testArray[2]);

        int[] cumArray = CumulativeArray.runningCumArray(testArray);
        assertEquals(4, cumArray[2]);
        assertEquals(45, cumArray[7]);
    }
}