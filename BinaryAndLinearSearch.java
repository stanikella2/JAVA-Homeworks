class Main {
  public static void main(String[] args) {
    // Don't mess with this
  }
}

class LinearSearch {
  public int linearSearch(int[] inputArray, int searchTarget) {
    // Fill in the code here to complete a linear search
    // Hint: loop through array, check if each element is searchTarget
    // If it is, return the *index*
    // If you don't find it, return -1
    for (int i = 0; i < inputArray.length; i++) {
      if (inputArray[i] == searchTarget) {
        return i;
      }
    }
    return -1;
  }
}

class BinarySearch {
  public int binarySearch(int[] sortedArray, int searchTarget) {
    // Fill in the code here to complete a binary search
    // Hint: Divide and conquer! How did we play the guess my number game?
    // If it is, return the *index*
    // If you don't find it, return -1
    int high = sortedArray.length -1;
    int low = 0;
    while (low <= high) {
      int middle = (high + low) / 2;
      if (sortedArray[middle] == searchTarget) {
        return middle;
      } else if (sortedArray[middle] > searchTarget) {
        high = middle - 1;
      } else {
        low = middle + 1;
      }
    }
    return -1;
  }
}
