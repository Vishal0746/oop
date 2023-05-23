import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Wordcount{
    public static void main(String[] args) {
        try {
            // Specify the path of the text file
            String filePath = "C:/Users/HP/Desktop/VIT 2ND YEAR/demo.txt";

            // Create a File object
            File file = new File(filePath);

            // Create a Scanner object to read the file
            Scanner scanner = new Scanner(file);

            int wordCount = 0;

            // Iterate through each word in the file
            while (scanner.hasNext()) {
                wordCount++;
            }

            // Close the scanner
            scanner.close();

            System.out.println("Number of words in the file: " + wordCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
