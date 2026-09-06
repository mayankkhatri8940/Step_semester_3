package session1.class_problems.problem2;

public class PalindromeChecker {

    public static boolean isPalindromeIterative(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        return isPalindromeRecursiveHelper(text, 0, text.length() - 1);
    }

    private static boolean isPalindromeRecursiveHelper(String text, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (text.charAt(left) != text.charAt(right)) {
            return false;
        }

        return isPalindromeRecursiveHelper(text, left + 1, right - 1);
    }

    public static boolean isPalindromeArrayReversal(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String text1 = "madam";

        System.out.println(
                "Iterative: " +
                        (isPalindromeIterative(text1) ? "Palindrome" : "Not Palindrome") +
                        " | Recursive: " +
                        (isPalindromeRecursive(text1) ? "Palindrome" : "Not Palindrome") +
                        " | Array Reversal: " +
                        (isPalindromeArrayReversal(text1) ? "Palindrome" : "Not Palindrome")
        );

        String text2 = "hello";

        System.out.println(
                "Iterative: " +
                        (isPalindromeIterative(text2) ? "Palindrome" : "Not Palindrome") +
                        " | Recursive: " +
                        (isPalindromeRecursive(text2) ? "Palindrome" : "Not Palindrome") +
                        " | Array Reversal: " +
                        (isPalindromeArrayReversal(text2) ? "Palindrome" : "Not Palindrome")
        );
    }
}