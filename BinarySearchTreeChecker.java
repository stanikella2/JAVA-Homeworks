import java.util.Scanner;

public class BinarySearchTreeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // parse the array representing the binary search tree
        int[] binaryTree;
        String input = sc.nextLine();
        if (input.equals("")) {
            binaryTree = new int[0];
        } else {
            String[] binaryTreeStrings = input.split(" ");
            binaryTree = new int[binaryTreeStrings.length];
            for (int i = 0; i < binaryTreeStrings.length; i++) {
                binaryTree[i] = Integer.parseInt(binaryTreeStrings[i]);
            }
        }

        // check if this is a binary search tree; print the result
        System.out.println(isBinarySearchTree(binaryTree));
    }

    /**
     * Wrapper function to determine if a binary tree is a binary search tree
     */
    private static boolean isBinarySearchTree(int[] binaryTree) {
        return isBinarySearchTreeRec(
                binaryTree,
                /* index */ 0,
                Integer.MIN_VALUE,
                Integer.MAX_VALUE);
    }

    /**
     * Recursive function to determine if the tree rooted at a given
     * index is a binary search tree
     */
    private static boolean isBinarySearchTreeRec(int[] binaryTree, int index, int lowerBound, int upperBound) {
        // If this node violates the binary search tree rules, return false
        if (binaryTree[index] < lowerBound || binaryTree[index] > upperBound) {
            return false;
        }

        // If the left subtree is not a binary search tree, return false
        if (index * 2 + 1 < binaryTree.length &&
                !isBinarySearchTreeRec(binaryTree, index * 2 + 1, lowerBound, binaryTree[index])) {
            return false;
        }

        // If the right subtree is not a binary search tree, return false
        if (index * 2 + 2 < binaryTree.length &&
                !isBinarySearchTreeRec(binaryTree, index * 2 + 2, binaryTree[index], upperBound)) {
            return false;
        }

        // If the above checks pass, this is a binary search tree
        return true;
    }

}
