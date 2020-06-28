package questions.lists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListUnidirectionTest {
    private LinkedListUnidirection linkedList = new LinkedListUnidirection();
    @BeforeEach
    void setUpRegularList() {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(5);

        linkedList.setListHead(ln1);
        linkedList.addNodeToTail(ln2);
        linkedList.addNodeToTail(ln3);
        linkedList.addNodeToTail(ln4);
        linkedList.addNodeToTail(ln5);
    }

    @Test
    void printListTest() {
        linkedList.printList();
        Integer firstNode = linkedList.getListHead().getOrder();
        assertEquals(1, firstNode);
        Integer tailNode = linkedList.getListTail().getOrder();
        assertEquals(5, tailNode);
    }

    @Test
    void removeHeadTest() {
        linkedList.removeHead();
        Integer newHead = linkedList.getListHead().getOrder();
        linkedList.printList();
        assertEquals(2, newHead);
    }

    @Test
    void removeAllNodesTest() {
        for (int i = 0; i < 5 ; i++) {
            linkedList.removeHead();
            ListNode listHead = linkedList.getListHead();
            System.out.println("current head - " + ((listHead != null ) ? listHead.getOrder() : "no head"));
        }
        ListNode listHead = linkedList.getListHead();
        assertNull(listHead);
    }

}