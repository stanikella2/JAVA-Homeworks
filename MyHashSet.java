public class MyHashSet {
    // size of the words array
    private static final int SIZE = 100000;
    
    // array that holds words
    private MyLinkedList[] words;
    
    public MyHashSet() {
        words = new MyLinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            words[i] = new MyLinkedList();
        }
    }
    
    /**
     * Adds a given word to our hash set
     */
    public void add(String word) {
        words[hash(word)].add(word);
    }
    
    /**
     * Check if our hash set contains a given word
     */
    public boolean contains(String word) {
        return words[hash(word)].contains(word);
    }
    
    /*
     * Implements the djb2 hash function
     * (this was ripped off the Internet)
     */
    private static int hash(String word) {
        long hash = 5381;
        
        for (int i = 0; i < word.length(); i++) {
            hash = ((hash << 5) + hash) + word.charAt(i);
        }

        // Mod our hash code by SIZE.
        // If the hash code is negative, move it to the
        // range [0, SIZE)
        int hashCode = (int) (hash % SIZE);
        if (hashCode < 0) {
            hashCode += SIZE;
        }
        return hashCode;
    }
}