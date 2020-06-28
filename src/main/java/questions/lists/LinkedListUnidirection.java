package questions.lists;

public class LinkedListUnidirection {
    private ListNode listHead;
    private ListNode listTail;

    public LinkedListUnidirection() {
    }

    public ListNode getListHead() {
        return listHead;
    }

    public void setListHead(ListNode listHead) {

        this.listHead = listHead;
        if (listHead.getNextNode() == null) {
            this.listTail = listHead;
        }
    }

    public ListNode getListTail() {
        return listTail;
    }

    public void addNodeToTail(ListNode listNode) {
        this.listTail.setNextNode(listNode);
        this.listTail = listNode;
    }

    public void removeHead() {
        if (this.listHead == null) {
            System.out.println("list is empty");
            return;
        }
        if (this.listHead.getNextNode() == null) {
            this.listHead = null;
            return;
        }

        this.listHead = listHead.getNextNode();
    }
    
    public void printList() {
        if (listHead == null)
            return;

        boolean hasNext = true;
        ListNode node = listHead;
        while (hasNext) {
            if (node.getNextNode() != null) {
                System.out.print(node.getOrder() + " --> ");
                node = node.getNextNode();
            }
            else {
                System.out.print(node.getOrder());
                hasNext = false;
            }
        }
    }
}
