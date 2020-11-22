import java.util.ArrayDeque;
import java.util.Deque;
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
        // initialize stack
        Deque<Character> openParenthesesStack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // put open parens in stack
            // for closes, check if the last one in the stack matches it
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                openParenthesesStack.addFirst(currentChar);
            } else {
                // empty certainly means no match
                if (openParenthesesStack.isEmpty()) {
                    return false;
                }

                char topOfStack = openParenthesesStack.getFirst();
                if ((currentChar == ')' && topOfStack != '(') ||
                        (currentChar == ']' && topOfStack != '[') ||
                        (currentChar == '}' && topOfStack != '{')) {
                    return false;
                }

                openParenthesesStack.removeFirst();
            }
        }

        // check for invalid open parens
        return openParenthesesStack.isEmpty();

    }
}
