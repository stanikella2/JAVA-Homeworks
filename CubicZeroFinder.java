import java.util.Scanner;

public class CubicZeroFinder {
    public static final double EPSILON = 1e-10; 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read in a, b, c, and d for our
        // equation ax^3 + bx^2 + cx + d = 0
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        int d = Integer.parseInt(sc.nextLine());
        
        // Find the zeroes
        String[] zeroes = findZeroes(a, b, c, d);
        
        // Print the zeroes, one per line
        for (int i = 0; i < zeroes.length; i++) {
            System.out.println(zeroes[i]);
        }
    }
    
    /**
     * Given a, b, c, and d for a cubic equation
     * ax^3 + bx^2 + cx + d = 0,
     * returns a sorted list of zeroes of
     * this cubic equation.
     */
    private static String[] findZeroes(int a, int b, int c, int d) {
        // variable for results
        String[] results = new String[0];
        
        // Find the critical points of the function (there are 0, 1, or 2)
        double[] criticalPoints = quadraticFormula(3.0*a, 2.0*b, (double) c);
        
        // If zero critical points, find the one real zero and two complex
        if (criticalPoints.length == 0) {
            double realZero = binarySearch(a, b, c, d, -100.0, 100.0, a < 0.0);
            results = findComplexZeroes(a, b, c, d, realZero);
        }
        
        // If one critical point
        if (criticalPoints.length == 1) {
            // If the critical point is on the x-axis, it's a triple root.
            // Else, find the one real zero and two complex.
            if (isAlmostEqual(eval(a,b,c,d, criticalPoints[0]), 0.0)) {
                String tripleZero = String.format("%.5f", criticalPoints[0]);
                results = new String[] { tripleZero, tripleZero, tripleZero };
            } else {
                double realZero = binarySearch(a, b, c, d, -100.0, 100.0, a < 0.0);
                results = findComplexZeroes(a, b, c, d, realZero);
            }
        }
        
        // If two critical points
        if (criticalPoints.length == 2) {
            // Sort critical points (smallest first)
            if (criticalPoints.length == 2 && criticalPoints[0] > criticalPoints[1]) {
                double tmp = criticalPoints[1];
                criticalPoints[1] = criticalPoints[0];
                criticalPoints[0] = tmp;
            }

            // Case with double root at critical_point[0]
            if (isAlmostEqual(eval(a,b,c,d,criticalPoints[0]), 0.0)) {
                results = new String[] {
                    String.format("%.5f", criticalPoints[0]),
                    String.format("%.5f", criticalPoints[0]),
                    String.format("%.5f", binarySearch(a,b,c,d, criticalPoints[1], 100.0, a < 0.0))
                };
            // Case with double root at critical_point[1]
            } else if (isAlmostEqual(eval(a,b,c,d, criticalPoints[1]), 0.0)) {
                results = new String[] {
                    String.format("%.5f", binarySearch(a,b,c,d, -100.0, criticalPoints[0], a < 0.0)),
                    String.format("%.5f", criticalPoints[1]),
                    String.format("%.5f", criticalPoints[1])
                };
            // Cases with one real and two complex roots, where both critical points < 0
            } else if ((eval(a,b,c,d,criticalPoints[0]) < 0.0) && (eval(a,b,c,d,criticalPoints[1]) < 0.0)) {
                if (a > 0.0) {
                    double realZero = binarySearch(a, b, c, d, criticalPoints[1], 100.0, false);
                    results = findComplexZeroes(a, b, c, d, realZero);
                } else {
                    double realZero = binarySearch(a, b, c, d, -100.0, criticalPoints[0], true);
                    results = findComplexZeroes(a, b, c, d, realZero);
                }
            // Cases with one real and two complex roots, where both critical points > 0
            } else if ((eval(a,b,c,d,criticalPoints[0]) > 0.0) && (eval(a,b,c,d,criticalPoints[1]) > 0.0)) {
                if (a > 0.0) {
                    double realZero = binarySearch(a, b, c, d, -100.0, criticalPoints[0], false);
                    results = findComplexZeroes(a, b, c, d, realZero);
                } else {
                    double realZero = binarySearch(a, b, c, d, criticalPoints[1], 100.0, true);
                    results = findComplexZeroes(a, b, c, d, realZero);
                }
            // Case with three real roots
            } else {
                results = new String[] {
                    String.format("%.5f", binarySearch(a,b,c,d, -100.0, criticalPoints[0], a < 0.0)),
                    String.format("%.5f", binarySearch(a,b,c,d, criticalPoints[0], criticalPoints[1], a > 0.0)),
                    String.format("%.5f", binarySearch(a,b,c,d, criticalPoints[1], 100.0, a < 0.0))
                };
            }
        }
        
        // Kill -0.00000s
        for (int i = 0; i < results.length; i++) {
            if (results[i].equals("-0.00000")) {
                results[i] = "0.00000";
            }
        }
        
        return results;
    }
    
    /**
     * Given a cubic equation ax^3+bx^2+cx+d = 0 and a real zero,
     * finds the pair of complex zeroes for this equation.
     */
    private static String[] findComplexZeroes(int a, int b, int c, int d, double realZero) {
        // perform synthetic division
        double factorA = (double) a;
        double factorB = (double) b + factorA * realZero;
        double factorC = (double) c + factorB * realZero;
        
        // find real part of the complex solutions
        double realPart = -1.0 * factorB / (2.0*factorA);
        
        // find the imaginary part of the complex solutions
        double imaginaryPart = nthRoot(-1.0 * factorB * factorB + 4.0 * factorA*factorC, 2) / (2.0 * factorA);
        if (imaginaryPart < 0.0) {
            imaginaryPart *= -1.0;
        }
        
        // Sort and return the three zeros
        if (realZero < realPart) {
            return new String[] {
                String.format("%.5f", realZero),
                String.format("%.5f", realPart) + "-" + String.format("%.5f", imaginaryPart) + "i",
                String.format("%.5f", realPart) + "+" + String.format("%.5f", imaginaryPart) + "i"
            };
        } else {
            return new String[] {
                String.format("%.5f", realPart) + "-" + String.format("%.5f", imaginaryPart) + "i",
                String.format("%.5f", realPart) + "+" + String.format("%.5f", imaginaryPart) + "i",
                String.format("%.5f", realZero)
            };
        }
    }

    /**
     * Returns true iff val1 and val2 are within EPSILON of each other
     */
    private static boolean isAlmostEqual(double val1, double val2) {
        return (val1 - val2 > -1.0*EPSILON) && (val1 - val2 < 1.0*EPSILON);
    }
    
    /**
     * Binary searches for a zero of the equation f(x) = ax^3+bx^2+cx+d
     * between lowerBound and upperBound.
     * If reversed is true, then f(x) > 0 at lowerBound and
     * f(x) < 0 at upperBound.
     * Returns null if no zero is found in the given range.
     */
    private static Double binarySearch(int a, int b, int c, int d,
               double lowerBound, double upperBound, boolean reversed) {
        // Iteratively guess the midpoint and check it
        while (upperBound - lowerBound > EPSILON*EPSILON) {
            // Compute guess and f(guess)
            double guess = (lowerBound + upperBound) / 2.0;
            double guessEval = eval(a,b,c,d, guess);
            
            // If guess^n is within 2*precision decimal places of number, stop.
            // (We use epsilon from above to do this).
            // Otherwise, update bounds accordingly.
            if (isAlmostEqual(guessEval, 0.0)) {
                return guess;
            } else if (guessEval < 0 && !reversed) {
                lowerBound = guess;
            } else if (guessEval > 0 && !reversed) {
                upperBound = guess;
            } else if (guessEval > 0 && reversed) {
                lowerBound = guess;
            } else if (guessEval < 0 && reversed) {
                upperBound = guess;
            } else {
                // Should never get here
                throw new UnsupportedOperationException();
            }
            
        }
        return null;
    }
    
    /**
     * Evaluates a cubic equation f(x) = ax^3+bx^2+cx+d at x
     */
    private static double eval(int a, int b, int c, int d, double x) {
        return a*pow(x, 3) + b*pow(x, 2) + c*x + d;
    }
    
    /**
     * Returns real solutions of a quadratic equation given
     * by ax^2 + bx + c = 0
     */
    private static double[] quadraticFormula(double a, double b, double c) {
        double discriminant = pow((double) b, 2) - 4*a*c;
        
        if (discriminant < 0) {
            return new double[0];
        }
        
        if (discriminant == 0) {
            return new double[] {(-1*b) / (2.0*a)};
        }
        
        return new double[] {
            (-1*b - nthRoot(discriminant, 2)) / (2.0*a),
            (-1*b + nthRoot(discriminant, 2)) / (2.0*a)
        };
    }
    
    /**
     * Returns the value of base raised to power
     */
    private static double pow(double base, int power) {
        double result = 1.0;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        
        return result;
    }
    
    /**
     * Computes the nth root of a given number
     */
    private static double nthRoot(double number, int n) {
        // Initialize bounds
        double lowerBound = 0.0;
        double upperBound = (double) number;
        
        // Iteratively guess the midpoint and check it
        while (true) {
            double guess = (lowerBound + upperBound) / 2.0;
            
            // compute guess^n
            double guessToTheN = 1.0;
            for (int i = 0; i < n; i++) {
                guessToTheN *= guess;
            }
            
            // If guess^n is within 2*precision decimal places of number, stop.
            // (We use epsilon from above to do this).
            // Otherwise, update bounds accordingly.
            if ((guessToTheN - number) < EPSILON &&
                    (guessToTheN - number) > (-1.0 * EPSILON)) {
                return guess;
            } else if (guessToTheN < number) {
                lowerBound = guess;
            } else if (guessToTheN > number) {
                upperBound = guess;
            } else {
                // should never get here
                throw new UnsupportedOperationException();
            }
            
        }
    }
}

