package exercise.cache;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeastRecentUseTest {

    private final LeastRecentUse leastRecentUse = new LeastRecentUse();

    private final List<String> myLinkedList = new LinkedList<>();
    @Test
    void setCacheTest() {
        leastRecentUse.set("1", "one");
        leastRecentUse.set("2", "two");
        leastRecentUse.set("3", "three");
        leastRecentUse.set("4", "four");

        assertEquals(3, leastRecentUse.getSize());
        assertTrue(leastRecentUse.containsKey("2"));
        assertFalse(leastRecentUse.containsKey("1"));
    }


    @Test
    void queueTest() {
        myLinkedList.add("one");
        myLinkedList.add("two");
        myLinkedList.add("three");
        myLinkedList.add("four");

        String removed = myLinkedList.remove(0);

        assertEquals("one", removed);

        myLinkedList.add("one");
        assertEquals("two", myLinkedList.get(0));


    }

}