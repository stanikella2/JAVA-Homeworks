public class MyLinkedList {
    MyLinkedListNode firstNode;
    
    public MyLinkedList() {
        firstNode = null;
    }
    
    /**
     * Adds a word to the beginning of this linked list
     */
    public void add(String word) {
        MyLinkedListNode newNode = new MyLinkedListNode(word);
        newNode.setNext(firstNode);
        firstNode = newNode;
    }
    
    /**
     * Linear search through this list's nodes
     * to check for a given word
     */
    public boolean contains(String word) {
        MyLinkedListNode currentNode = firstNode;
        
        while (currentNode != null) {
            if (currentNode.getValue().equals(word)) {
                return true;
            }
            
            currentNode = currentNode.getNext();
        }
        
        return false;
    }
}