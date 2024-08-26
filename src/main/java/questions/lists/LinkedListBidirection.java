package questions.lists;

public class LinkedListBidirection {

    private ListNode listHead;
    private ListNode listTail;

    public LinkedListBidirection() {
    }

    public void addNodeToTail(Integer number) {
        ListNode node = new ListNode(number);
        if (listHead == null) {
            listHead = node;
            listTail = node;
        } else {
            listTail.setNextNode(node);
            node.setPrevNode(listTail);
            listTail = node;
        }
    }

    public Integer getHead() {
        return listHead.getOrder();
    }

    public Integer getTail() {
        return listTail.getOrder();
    }

    public Integer removeHead() {
        if (listHead == null) {
            return null;
        }
        Integer order = listHead.getOrder();
        listHead = listHead.getNextNode();
        if (listHead != null) {
            listHead.setPrevNode(null);
        }
        return order;
    }

    public Integer removeTail() {
        if (listTail == null) {
            return null;
        }
        ListNode prevNode = listTail.getPrevNode();
        prevNode.setNextNode(null);
        Integer order = listTail.getOrder();
        listTail = prevNode;
        return order;
    }
}
