import java.util.*;
import java.lang.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // read input
        String expression = sc.nextLine();

        // print the evaluated result
        System.out.println(eval(expression));
    }

    /**
     * Evaluates an expression containing +, *, parentheses and digits. Here, we put
     * characters of the experssion into a stack. When we encounter ')', we pop
     * characters out until we encounter the closest '('. We then evaluate that sub
     * expression and push the result back into the stack. Once we've gone through
     * the expression string, the stack will no longer contain parentheses. Finally,
     * we empty the stack and evaluate that final expression.
     */
    private static int eval(String expression) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            s.push(c);
            if (s.peek() == ')') {

                s.pop(); // remove the ')'
                StringBuilder subExpression = new StringBuilder();
                while (s.peek() != '(') {
                    subExpression.insert(0, s.pop());
                }
                s.pop(); // remove the '('

                String value = Integer.toString(evalAddMultiplication(subExpression.toString()));
                for (int x = 0; x < value.length(); x++) {
                    s.push(value.charAt(x));
                }
            }
        }
        StringBuilder finalExpression = new StringBuilder();
        while (!s.empty()) {
            finalExpression.insert(0, s.pop());
        }
        return evalAddMultiplication(finalExpression.toString());
    }

    /**
     * Evaluates an expression containing +, *, and digits
     */
    private static int evalAddMultiplication(String expression) {
        // Separate on +.
        // This gives us an array of numbers and numbers mixed with *
        String[] addends = expression.split("\\+");

        // sum these sub-expressions of numbers and/or *'s
        Integer sum = 0;
        for (int i = 0; i < addends.length; i++) {
            // if a sub-expression contains *, evaluate it and add to total
            // otherwise, just add it to our running total
            if (addends[i].contains("*")) {
                sum += evalMultiplication(addends[i]);
            } else {
                sum += Integer.parseInt(addends[i]);
            }
        }

        return sum;
    }

    /**
     * Evaluates a string containing digits and * signs
     */
    private static int evalMultiplication(String expression) {
        // Separate on *, giving an array of numbers to be multiplied
        String[] factors = expression.split("\\*");

        // multiply these numbers
        Integer product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= Integer.parseInt(factors[i]);
        }

        return product;
    }
}
