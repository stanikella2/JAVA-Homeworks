import java.util.Scanner;

public class BubbleSorter {
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

        // Sort the list
        bubbleSort(numbers);

        // Print the sorted list
        StringBuilder resultSb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            resultSb.append(new Integer(numbers[i]).toString());
            if (i < numbers.length - 1) {
                resultSb.append(" ");
            }
        }
        System.out.println(resultSb.toString());
    }

    /**
     * Runs the BubbleSort algorithm on numbers.
     */
    public static void bubbleSort(int[] numbers) {
        // Iterate through numbers up to n-1 times
        for (int i = 0; i < numbers.length - 1; i++) {
            // Track if swaps were made
            boolean swapsMade = false;

            // Swap each adjacent pair that is not in order
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j+1]) {
                    // track that we made a swap
                    swapsMade = true;

                    // swap indices j and j+1
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }

            // If no swaps were made, we have finished sorting
            if (!swapsMade) {
                return;
            }
        }
    }
}
