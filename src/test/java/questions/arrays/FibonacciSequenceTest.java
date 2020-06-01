package questions.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSequenceTest {
    @Test
    void fiboTest4() {
        Integer fibo = FibonacciSequence.calcFiboNumber(4);
        assertEquals(5, fibo);

    }
    @Test
    void fiboTest12() {
        Integer fibo = FibonacciSequence.calcFiboNumber(11);
        assertEquals(144, fibo);

    }

}