public class MyLinkedListNode {
    private String value;
    private MyLinkedListNode next;
    
    /**
     * Initializes a linked list node containing a word.
     * We initially set the next pointer to null.
     */
    public MyLinkedListNode(String value) {
        this.value = value;
        next = null;
    }
    
    public String getValue() {
        return value;
    }
    
    public MyLinkedListNode getNext() {
        return next;
    }
    
    public void setNext(MyLinkedListNode next) {
        this.next = next;
    }
}