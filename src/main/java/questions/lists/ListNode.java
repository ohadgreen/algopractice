package questions.lists;

public class ListNode {
    private Integer order;
    private ListNode nextNode;
    private ListNode prevNode;

    public ListNode() {
    }

    public ListNode(Integer order) {
        this.order = order;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public ListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListNode nextNode) {
        this.nextNode = nextNode;
    }

    public ListNode getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(ListNode prevNode) {
        this.prevNode = prevNode;
    }
}
