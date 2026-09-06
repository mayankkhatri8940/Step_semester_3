package session1.assigment_problems.problem2;

public class TypingSpeedAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {

        int matchedCharacters = 0;
        int firstMismatchPosition = -1;

        for (int i = 0; i < original.length(); i++) {

            if (original.charAt(i) == typed.charAt(i)) {
                matchedCharacters++;
            } else if (firstMismatchPosition == -1) {
                firstMismatchPosition = i;
            }
        }

        double accuracy =
                ((double) matchedCharacters / original.length()) * 100;

        if (firstMismatchPosition == -1) {
            System.out.printf(
                    "Matched: %d/%d | Accuracy: %.2f%% | No Mismatches%n",
                    matchedCharacters,
                    original.length(),
                    accuracy
            );
        } else {
            System.out.printf(
                    "Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')%n",
                    matchedCharacters,
                    original.length(),
                    accuracy,
                    firstMismatchPosition + 1,
                    original.charAt(firstMismatchPosition),
                    typed.charAt(firstMismatchPosition)
            );
        }
    }

    public static void main(String[] args) {

        String original1 = "hello world";
        String typed1 = "hello worlt";

        checkTypingAccuracy(original1, typed1);

        String original2 = "coding";
        String typed2 = "coding";

        checkTypingAccuracy(original2, typed2);
    }
}