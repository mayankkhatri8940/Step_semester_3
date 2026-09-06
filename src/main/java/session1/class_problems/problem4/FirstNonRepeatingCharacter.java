package session1.class_problems.problem4;

public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingChar(String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        String text1 = "swiss";
        char result1 = findFirstNonRepeatingChar(text1);

        if (result1 == '\0') {
            System.out.println("No Non-Repeating Character Found");
        } else {
            System.out.println("First Non-Repeating Character: '" + result1 + "'");
        }

        String text2 = "aabbcc";
        char result2 = findFirstNonRepeatingChar(text2);

        if (result2 == '\0') {
            System.out.println("No Non-Repeating Character Found");
        } else {
            System.out.println("First Non-Repeating Character: '" + result2 + "'");
        }
    }
}