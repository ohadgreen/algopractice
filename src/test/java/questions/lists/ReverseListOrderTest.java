package questions.lists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseListOrderTest {
    private LinkedListUnidirection linkedList = new LinkedListUnidirection();
    ReverseListOrder reverseListOrder = new ReverseListOrder();


    @BeforeEach
    void setUp() {
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
    void reverseOrder() {
        reverseListOrder.reverseOrder(linkedList);
        linkedList.printList();
    }
}