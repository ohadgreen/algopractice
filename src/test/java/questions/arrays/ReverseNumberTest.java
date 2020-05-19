package questions.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNumberTest {

    @Test
    void n1() {
        ReverseNumber.solution(1000);
    }

    @Test
    void n123() {
        ReverseNumber.solution(123);
    }

    @Test
    void new1000() {
        ReverseNumber.newSolution(1000);
    }

    @Test
    void new1() {
        ReverseNumber.newSolution(123);
    }

    @Test
    void newTrailingZero() {
        ReverseNumber.newSolution(120);
    }



}