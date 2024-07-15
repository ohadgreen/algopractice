package questions.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    private Palindrome palindrome = new Palindrome();

    @Test
    void evenCharStringTest() {
        String str1 = "ABCDDCBA";
        boolean isPalindrome = palindrome.isPalindrome(str1);
        assertTrue(isPalindrome);

        assertFalse(palindrome.isPalindrome("ABCDDCAX"));
    }

    @Test
    void oddCharStringTest() {
        String str2 = "ABCDCBA";
        boolean isPal = palindrome.isPalindrome(str2);
        assertTrue(isPal);

        assertFalse(palindrome.isPalindrome("ABCBV"));
    }

    @Test
    void isPalindromeTwoPointersEvenStringTest() {
        String str = "ABCDDCBA";
        assertTrue(palindrome.isPalindromeWithTwoPointers(str));

        assertFalse(palindrome.isPalindromeWithTwoPointers("ABCDXCBA"));
    }

    @Test
    void isPalindromeTwoPointersOddStringTest() {
        String str = "ABCDCBA";
        assertTrue(palindrome.isPalindromeWithTwoPointers(str));

        assertFalse(palindrome.isPalindromeWithTwoPointers("ABZXCBA"));
    }

    @Test
    void isPalindromeTwoPointersOddOrEvenStringTest() {
        String str = "ABCDCBA";
        assertTrue(palindrome.isPalOddOrEven(str));

        assertFalse(palindrome.isPalOddOrEven("ABZXCBA"));

        assertTrue(palindrome.isPalOddOrEven("ABCCBA"));
        assertFalse(palindrome.isPalOddOrEven("ABCQBA"));

        assertTrue(palindrome.isPalOddOrEven(""));
    }

}