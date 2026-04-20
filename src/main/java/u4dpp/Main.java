package u4dpp;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi! This is the u4dpp project. Have fun! :)");

        // Example tests
        System.out.println("Fibonacci(7): " + RecursiveMath.getFibonacciNumber(7));
        System.out.println("Factorial(5): " + RecursiveMath.getFactorial(5));
        System.out.println("4^3: " + RecursiveMath.pow(4, 3));
        System.out.println("Is 'racecar' a palindrome? " + RecursivePalindromeChecker.isPalindrome("racecar"));
    }
}