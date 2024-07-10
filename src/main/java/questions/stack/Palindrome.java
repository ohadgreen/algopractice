package questions.stack;

import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String s1 = "ABCBA";
        String s2 = "ABCDDCBA";
    }

    protected boolean isPalindrome(String str) {
        boolean isPalindrome = true;

        if (str.length() == 1) {
            return true;
        }

        Stack<Character> charStack = new Stack<>();

        int middleOfString;

        if (str.length() % 2 == 0) {
            middleOfString = str.length() / 2;

            for (int i=0; i<middleOfString; i++) {
                charStack.push(str.charAt(i));
            }

            for (int i=middleOfString; i<str.length(); i++) {
                char strChar = str.charAt(i);
                Character topChar = charStack.pop();
                if (!topChar.equals(strChar)) {
                    return false;
                }
            }

        } else {
            middleOfString = (str.length() - 1) / 2;

            for (int i=0; i<middleOfString; i++) {
                charStack.push(str.charAt(i));
            }

            for (int i=middleOfString+1; i<str.length(); i++) {
                char strChar = str.charAt(i);
                Character topChar = charStack.pop();
                if (!topChar.equals(strChar)) {
                    return false;
                }
            }
        }
        return isPalindrome;
    }

    public boolean isPalindromeWithTwoPointers(String str) {
        if (str.length() <= 1) {
            return true;
        }

        boolean isPal = true;

        int middleCharIndex;
        if (str.length() % 2 == 0) {
            middleCharIndex = str.length() / 2;
        } else {
            middleCharIndex = (str.length() - 1) / 2;
        }

        for (int i=0; i<middleCharIndex; i++) {
            char leftChar = str.charAt(i);
            char rightChar = str.charAt(str.length()- 1 - i);
            if (leftChar != rightChar) {
                return false;
            }
        }

        return isPal;
    }

}
