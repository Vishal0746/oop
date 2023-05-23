import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        String sentence = "shubh is a shubh";

        Map<String, Integer> wordCount = countDuplicateWords(sentence);

        System.out.println("Sentence: " + sentence);
        System.out.println("Duplicate Words Count: ");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + ": " + count);
        }
    }

    public static Map<String, Integer> countDuplicateWords(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = sentence.toLowerCase().split("\\s+");

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                // If the word already exists in the map, increment its count
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                // If the word is encountered for the first time, add it to the map with count 1
                wordCount.put(word, 1);
            }
        }

        // Remove words with count 1, as they are not duplicate words
        wordCount.entrySet().removeIf(entry -> entry.getValue() == 1);

        return wordCount;
    }
}

