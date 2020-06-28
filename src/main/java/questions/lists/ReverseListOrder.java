package questions.lists;

public class ReverseListOrder {

    public void reverseOrder(LinkedListUnidirection linkedList) {
        if (linkedList.getListHead() == null)
            return;

        boolean hasNext = true;
        ListNode node = linkedList.getListHead();
        ListNode prevNode = null;
        ListNode nextNode = null;
        while (hasNext) {

            if (node.getNextNode() != null) {
                nextNode = node.getNextNode();
                node.setNextNode(prevNode);
                prevNode = node;
                node = nextNode;
            }
            else {
                node.setNextNode(prevNode);
                linkedList.setListHead(node);
                hasNext = false;
            }
        }
    }
}
