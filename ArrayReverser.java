import java.util.Scanner;

public class ArrayReverser {
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
        
        // Reverse the list
        int[] resultArray = reverseArray(numbers);
        
        // Print the reversed list
        StringBuilder resultSb = new StringBuilder();
        for (int i = 0; i < resultArray.length; i++) {
            resultSb.append(new Integer(resultArray[i]).toString());
            if (i < resultArray.length - 1) {
                resultSb.append(" ");
            }
        }
        System.out.println(resultSb.toString());
    }
    
    private static int[] reverseArray(int[] originalArray) {
        int n = originalArray.length;
        
        // swap each of the first n/2 elements with the
        // corresponding element at the end of the list
        for (int i = 0; i < n/2; i++) {
            int tmp = originalArray[n-i-1];
            originalArray[n-i-1] = originalArray[i];
            originalArray[i] = tmp;
        }
        
        return originalArray;
    }
}
