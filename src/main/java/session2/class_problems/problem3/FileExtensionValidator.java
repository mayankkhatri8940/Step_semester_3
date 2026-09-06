package session2.class_problems.problem3;

public class FileExtensionValidator {

    public static String validateFileExtension(String filename) {

        int lastDotIndex = filename.lastIndexOf('.');

        if (lastDotIndex == -1 || lastDotIndex == filename.length() - 1) {
            return "Rejected — invalid file type";
        }

        String extension = filename.substring(lastDotIndex + 1);

        if (extension.equalsIgnoreCase("pdf") ||
                extension.equalsIgnoreCase("docx") ||
                extension.equalsIgnoreCase("zip")) {
            return "Accepted";
        }

        return "Rejected — invalid file type";
    }

    public static void main(String[] args) {

        String file1 = "Assignment1.PDF";
        String file2 = "notes.txt";

        System.out.println(validateFileExtension(file1));
        System.out.println(validateFileExtension(file2));
    }
}