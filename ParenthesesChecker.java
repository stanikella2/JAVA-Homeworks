import java.util.Scanner;

public class ParenthesesChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input string
        String input = sc.nextLine();
            
        // Print whether the string has balanced parentheses
        System.out.println(hasBalancedParentheses(input));
    }
    
    private static boolean hasBalancedParentheses(String input) {
        // Set a counter = 0.
        // We will add 1 for a (, and subtract 1 for a -.
        int balanceCounter = 0;
        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                balanceCounter++;
            } else {
                balanceCounter--;
                
                // return false if we have an imbalanced )
                if (balanceCounter < 0) {
                    return false;
                }
            }
        }
        
        // if balanceCounter > 0, we have an imbalanced (
        return balanceCounter == 0;
    }
}