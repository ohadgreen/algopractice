package questions.hashmap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMapTest {

    private MyMap myMap;

    @BeforeEach
    public void setUp() {
        myMap = new MyMap();
        initTestValues();
    }

    @Test
    void setKeyValue() {
        myMap.setKeyValue(10, "ten");
        String value = myMap.getValue(10);
        assertEquals("ten", value);
    }

    @Test
    void getValue() {
        assertEquals("one", myMap.getValue(1));
    }

    @Test
    void setAll() {
        myMap.setAll("eleven");
        assertEquals("eleven", myMap.getValue(3));
        assertEquals("eleven", myMap.getValue(2));
    }

    private void initTestValues() {
        myMap.setKeyValue(1, "one");
        myMap.setKeyValue(2, "two");
        myMap.setKeyValue(3, "three");
    }
}