package u4dpp;

/**
 * Utility class to check for palindromes recursively.
 */
public class RecursivePalindromeChecker {

    /**
     * Returns true if s is a palindrome.
     */
    // check is s is a palindrome through recursion
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return isPalindrome(s.substring(1, s.length() - 1));
    }
}