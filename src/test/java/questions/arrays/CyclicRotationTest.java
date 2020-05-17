package questions.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyclicRotationTest {

    @Test
    public void simpleArrayTest() {
        String[] testArray = {"a", "b", "c", "d", "e", "f", "g"};
        String[] shiftedArray = CyclicRotation.switchArray(testArray, 2);
        printArray(shiftedArray);

        assertEquals("f", shiftedArray[0]);
    }

    @Test
    public void simpleArrayTest5() {
        String[] testArray = {"a", "b", "c", "d", "e", "f", "g"};
        String[] shiftedArray = CyclicRotation.switchArray(testArray, 5);
        printArray(shiftedArray);

        assertEquals("c", shiftedArray[0]);
    }

    private void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}