package questions.lists;

import java.util.LinkedList;
import java.util.Queue;

public class BiDirList2 {

    private final Queue<Node> queue = new LinkedList<>();
    private Node head;
    private Node tail;

    public void addNodeToTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public int removeFromHead() {
        if (head == null) {
            return -1;
        } else {
            int data = head.data;
            Node newHead = head.next;
            newHead.prev = null;
            head = newHead;
            return data;
        }
    }

    public int getHead() {
        return head.data;
    }

    public int getTail() {
        return tail.data;
    }

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
