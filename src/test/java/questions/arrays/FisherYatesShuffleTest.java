package questions.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FisherYatesShuffleTest {

    @Test
    void shuffleArrayTest() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        FisherYatesShuffle.shuffleArray(numbers);
    }
}