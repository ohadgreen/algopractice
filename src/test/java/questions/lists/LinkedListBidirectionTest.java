package questions.lists;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListBidirectionTest {

    private final LinkedListBidirection linkedListBidirection = new LinkedListBidirection();


    @BeforeEach
    void initList() {
        linkedListBidirection.addNodeToTail(1);
        linkedListBidirection.addNodeToTail(2);
        linkedListBidirection.addNodeToTail(3);
        linkedListBidirection.addNodeToTail(4);
        linkedListBidirection.addNodeToTail(5);
    }
    @Test
    void insertNodeToTailTest() {
        assertEquals(1, linkedListBidirection.getHead());
    }

    @Test
    void removeHeadTest() {
        assertEquals(1, linkedListBidirection.removeHead());
        assertEquals(2, linkedListBidirection.getHead());
    }

    @Test
    void removeTailTest() {
        Integer tail = linkedListBidirection.removeTail();
        assertEquals(5, tail);
        assertEquals(4, linkedListBidirection.getTail());
    }

}