package questions.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighestIntTest {

    private final HighestInt highestInt = new HighestInt();

    @Test
    void checkHighestIntTest() {
        highestInt.pushInt(2);
        assertEquals(2, highestInt.highestInt());

        highestInt.pushInt(1);
        assertEquals(2, highestInt.highestInt());

        highestInt.pushInt(3);
        assertEquals(3, highestInt.highestInt());

        highestInt.popInt();
        assertEquals(2, highestInt.highestInt());

    }

}