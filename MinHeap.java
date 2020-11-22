package homework7;
import java.util.ArrayList;

public class MinHeap {
  private ArrayList<Integer> data;

  public MinHeap() {
    data = new ArrayList<>();
  }

  private int getParent(int index) { 
    return (index - 1) / 2; 
  }
  
  private int getLeftChild(int index) { 
    return index * 2 + 1; 
  } 

  private int getRightChild(int index) { 
    return index * 2 + 2;  
  } 

  // takes in the index, swaps the VALUE at those indices
  private void swap(int indexA, int indexB) {
    int temp = data.get(indexA);
    data.set(indexA, data.get(indexB));
    data.set(indexB, temp);
  }

  public void print() {
    System.out.println(data.toString());
  }

  // assume positive numbers only, return -1 if no max
  int getMin(){
    // heap is empty
    if(data.size() == 0){
      return -1;
    }
    // heap is not empty, return the root
    return data.get(0);
  }

  void insert(int val) {
    data.add(val);
    int currIndex = data.size() - 1;
    // while the value we just added is larger than its parent 
    // swap with parent
    int parentIndex = getParent(currIndex);
    // the current index value is LARGER than the value at the parent index
    while(data.get(currIndex) > data.get(parentIndex)){
      // swap the values at the current index and parent index
      swap(currIndex, parentIndex);
      // update the current index
      currIndex = parentIndex;
      // get the new parent index
      parentIndex = getParent(currIndex);
    }
  }

  // Remove AND return max element
  public int extractMin() {
    // get the max, which is at the root
    int min = data.get(0);
    // swap the root with the last node
    swap(0, data.size() - 1);
    // delete the last node
    data.remove(data.size()-1);
    // put the value at the root in the right place
    minHeapify(0);
    return min;
    
  }

  // Assumes left and right child are heaps
  // index may or may not be out of place
  void minHeapify(int index) {
    // base case: if we have no more children
    int leftChildIndex = getLeftChild(index);
    int rightChildIndex = getRightChild(index);
    if(leftChildIndex > data.size() - 1){
      // left child index is always smaller than right child index, so we're only checking if the left child exists 
      return;
    }

    // check if the node has 1 children or 2 children
    // only one child
    if(rightChildIndex > data.size() - 1){
      if(data.get(index) > data.get(leftChildIndex)){
        swap(index, leftChildIndex);
        minHeapify(leftChildIndex);
      }
      return;
    } else {
      // two children
      // if the node is the biggest element, stop
      if(data.get(index) < data.get(leftChildIndex) && data.get(index) < data.get(rightChildIndex)){
        return;
      } else if(data.get(leftChildIndex) < data.get(rightChildIndex)){
        swap(index, leftChildIndex);
        minHeapify(leftChildIndex);
      } else {
        swap(index, rightChildIndex);
        minHeapify(rightChildIndex);
      }
    }
  }

}
