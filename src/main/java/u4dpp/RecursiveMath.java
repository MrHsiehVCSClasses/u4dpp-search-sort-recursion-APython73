package u4dpp;

import java.math.BigInteger;


public class RecursiveMath {

    /**
     * Recursive power function: base^exponent.
     */
    public static double pow(double base, int exponent) {
        if (exponent == 0) return 1.0;
        return base * pow(base, exponent - 1);
    }

    /**
     * Recursive factorial using BigInteger (bigger cap on numbers).
     */
    public static BigInteger getFactorial(int n) {
        if (n <= 1) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(getFactorial(n - 1));
    }

    /**
     * Recursive Fibonacci function.
     */
    public static int getFibonacciNumber(int n) {
        if (n == 1 || n == 2) return 1;
        return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
    }
}