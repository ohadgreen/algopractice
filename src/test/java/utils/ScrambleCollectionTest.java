package utils;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static utils.PrintUtil.printArray;

class ScrambleCollectionTest {

    @Test
    public void scrambledArrayFromList() {
        List<Integer> numbersList = InitCollection.createNumbersList(10);
        numbersList.remove(3);
        System.out.println(numbersList);

        int[] scramble = ScrambleCollection.scrambleNumberListToArray(numbersList);
        printArray(scramble);
        assertNotNull(scramble);
    }

}