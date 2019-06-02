package questions.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMissingNumberTest {

    @Test
    public void missingNumberReturned() {

        int missingNumber = FindMissingNumber.findMissingNumberInArray(20);
        System.out.println("missingNumber = " + missingNumber);
        assertNotNull(missingNumber);
    }

}