import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // read input number (which will be between 2 and 1000)
        int number = Integer.parseInt(sc.nextLine());

        // factor the number into an array of prime factors
        int[] factors = factorize(number);

        // print array of factors
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i]);
            if (i != factors.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static int[] factorize(int number) {
        // Check all numbers starting from number-1 to find the largest factor.
        for (int i = number - 1; i >= 2; i--) {
            if (number % i == 0) {
                // Factorize the largest factor recursively
                int[] otherFactors = factorize(i);
                int[] allFactors = new int[otherFactors.length + 1];

                // Prepend the factor we took out (which is number / largest factor)
                for (int j = 0; j < otherFactors.length; j++) {
                    allFactors[j+1] = otherFactors[j];
                }
                allFactors[0] = number/i;

                // Return the array of factors
                return allFactors;
            }
        }

        // Base case: no factors except the number itself
        return new int[] { number };
    }
}
