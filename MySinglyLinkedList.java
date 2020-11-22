/**
 * This is a custom, stripped-down version of a LinkedList
 * which you will use for this problem instead of a regular
 * LinkedList.
 */
public class MySinglyLinkedList {
    private MySinglyLinkedListNode firstNode = null;
    private int length = 0;
    
    /**
     * Constructs a MyLinkedList from an integer array.
     */
    public MySinglyLinkedList(int[] numbersArray) {
        // set length
        length = numbersArray.length;
        
        // leave the first and last nodes as null if there
        // are no elements in the array
        if (numbersArray.length == 0) {
            return;
        }
        
        // set the first node to the first number
        firstNode = new MySinglyLinkedListNode(numbersArray[0], null);
        
        // create all the other nodes
        MySinglyLinkedListNode prevNode = firstNode;
        for (int i = 1; i < numbersArray.length; i++) {
            MySinglyLinkedListNode currentNode =
                new MySinglyLinkedListNode(numbersArray[i], null);
            prevNode.setNext(currentNode);
            prevNode = currentNode;
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(length);
        
        MySinglyLinkedListNode currentNode = firstNode;
        for (int i = 0; i < length; i++) {
            sb.append(currentNode.toString());
            if (i < length - 1) {
                sb.append(" ");
                currentNode = currentNode.getNext();
            }
        }
        
        return sb.toString();
    }
    
    /**
     * Reverses this linked list.
     */
    public void reverse() {
        // check for empty list
        if (firstNode == null) {
            return;
        }
        
        // maintain current, prev, and next nodes
        MySinglyLinkedListNode currentNode = firstNode;
        MySinglyLinkedListNode prevNode = null;
        MySinglyLinkedListNode nextNode = firstNode.getNext();
        
        // move through list and flip the next pointers
        for (int i = 0; i < length; i++) {
            currentNode.setNext(prevNode);
            
            if (i < length - 1) {
                prevNode = currentNode;
                currentNode = nextNode;
                nextNode = nextNode.getNext();
            }
        }
        
        // new first node is the last node
        firstNode = currentNode;
    }
}
