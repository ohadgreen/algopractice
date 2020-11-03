package questions.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static questions.numbers.SumDigits.sumDigits;
import static questions.numbers.SumDigits.sumDigitsToSingleDigits;

class SumDigitsTest {
    @Test
    void testSumDigits() {
        int n = 5012;
        System.out.println(n + " sum digits: " + sumDigits(n));
    }

    @Test
    void testSumToSingleDigit() {
        int sum = sumDigitsToSingleDigits(10008);
        assertEquals(9, sum);
    }

    @Test
    void testSumToSingleDigit2() {
        int sum = sumDigitsToSingleDigits(1999);
        assertEquals(1, sum);
    }

}