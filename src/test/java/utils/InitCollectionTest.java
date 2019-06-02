package utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InitCollectionTest {
    private int[] randomNumbersArray;
    private List<Integer> numbersList;

    @BeforeEach
    public void initArray() {
        randomNumbersArray = InitCollection.createNumbersArray(20);
        numbersList = InitCollection.createNumbersList(20);
    }

    @Test
    public void checkNumberInDesiredIndex() {
        assertEquals(10, randomNumbersArray[10]);
    }

    @Test
    public void checkLastNumber() {
        assertEquals(19, randomNumbersArray[19]);
    }

    @Test
    public void checkArrayLength() {
        assertEquals(20, randomNumbersArray.length);
    }

    @Test
    public void checkNumberIndexInList() {
        assertEquals(10, numbersList.get(10));
    }

    @Test
    public void testRemoveRandomNumberFromList() {
        InitCollection.removeRandomNumFromList(numbersList);
        assertEquals(19, numbersList.size());
    }

}