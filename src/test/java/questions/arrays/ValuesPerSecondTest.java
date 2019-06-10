package questions.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import questions.model.SecondValue;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ValuesPerSecondTest {

    private SecondValue[] secValsArray;

    @BeforeEach
    public void setValueArray() {
        SecondValue sv1 = new SecondValue((float) .111, 10);
        SecondValue sv2 = new SecondValue((float) .150, 9);
        SecondValue sv3 = new SecondValue((float) 1.3, 5);
        SecondValue sv4 = new SecondValue((float) 2.1, 10);
        SecondValue sv5 = new SecondValue((float) 2.2, 11);

        secValsArray = new SecondValue[]{sv1, sv2, sv3, sv4, sv5};
    }

    @Test
    public void testValsAvg() {
        List<Double> avgValues = ValuesPerSecond.calculateAvgPerSecond(secValsArray);
        assertEquals(9.5, avgValues.get(0));
    }
}