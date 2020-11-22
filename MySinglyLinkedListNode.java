/**
 * This class represents a linked list node (i.e. an object
 * containing an element and its next and previous
 * objects in the list)
 */
public class MySinglyLinkedListNode {
    private int value = 0;
    private MySinglyLinkedListNode next = null;

    public MySinglyLinkedListNode(int value, MySinglyLinkedListNode next) {
        this.value = value;
        this.next = next;
    }

    public MySinglyLinkedListNode getNext() {
        return next;
    }

    public void setNext(MySinglyLinkedListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return (new Integer(this.value)).toString();
    }
}