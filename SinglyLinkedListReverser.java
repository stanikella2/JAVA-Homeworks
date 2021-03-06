import java.util.Scanner;

public class SinglyLinkedListReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read in the list of numbers
        int[] numbers;
        String input = sc.nextLine();
        if (input.equals("")) {
            numbers = new int[0];
        } else {
            String[] numberStrings = input.split(" ");
            numbers = new int[numberStrings.length];
            for (int i = 0; i < numberStrings.length; i++) {
                numbers[i] = Integer.parseInt(numberStrings[i]);
            }
        }
        
        // Create a MyLinkedList containing these numbers
        MySinglyLinkedList numbersList = new MySinglyLinkedList(numbers);
        
        // Reverse the list
        numbersList.reverse();
        
        // Print the reversed list
        System.out.println(numbersList.toString());
    }
}

