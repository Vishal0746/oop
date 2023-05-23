import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Read 10 strings from the console
            String[] strings = new String[10];
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter a string: ");
                strings[i] = scanner.nextLine();
            }

            // Sort the strings
            Arrays.sort(strings);

            // Print the sorted strings
            System.out.println("Sorted Strings:");
            for (String str : strings) {
                System.out.println(str);
            }

            // Combine two strings
            String combinedString = strings[0] + strings[1];
            System.out.println("Combined String: " + combinedString);

            // Reverse the first string
            String reversedString = reverseString(strings[0]);
            System.out.println("Reversed First String: " + reversedString);
        }
    }

    // Helper method to reverse a string
    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
