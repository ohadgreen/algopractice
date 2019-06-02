package utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomGeneratorTest {
    private int randomNumber;

    @BeforeEach
    public void generateRandomNumber() {
        randomNumber = RandomGenerator.generateRandomNumberInRange(1, 10);
    }

    @Test
    public void randomNumberReturned() {
        assertNotNull(randomNumber);
    }

    @Test
    public void randomNumWithinRange() {
        System.out.println("randomNumber = " + randomNumber);
        assertTrue(randomNumber > 0 && randomNumber < 10);
    }

    @Test
    public void testWithOneNumberRange() {
        int zero = RandomGenerator.generateRandomNumberInRange(0, 1);
        assertEquals(0, zero);

    }

}