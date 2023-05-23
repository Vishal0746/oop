import java.util.HashMap;
import java.util.Scanner;

public class WordCount1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter String: ");
            String input = scanner.nextLine();

            HashMap<String, Integer> wordCountMap = new HashMap<>();

            // Split the input string into words
            String[] words = input.split(" ");

            // Count the occurrence of each word
            for (String word : words) {
                if (wordCountMap.containsKey(word)) {
                    // If the word is already in the map, increment its count
                    int count = wordCountMap.get(word);
                    wordCountMap.put(word, count + 1);
                } else {
                    // If the word is not in the map, add it with count 1
                    wordCountMap.put(word, 1);
                }
            }

            // Print the word count map
            System.out.println(wordCountMap);
        }
    }
}
