package u4dpp;


public class RecursivePalindromeChecker {

    /**
     * Returns true if s is a palindrome.
     */
    // check is string is palindrome with recursion
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return isPalindrome(s.substring(1, s.length() - 1));
    }
}