import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a HashMap to store the phone book entries
        Map<String, String> phoneBook = new HashMap<>();
        
        // Read the number of entries in the phone book
        int numEntries = Integer.parseInt(scanner.nextLine());
        
        // Read the phone book entries
        for (int i = 0; i < numEntries; i++) {
            String name = scanner.nextLine();
            String phoneNumber = scanner.nextLine();
            phoneBook.put(name, phoneNumber);
        }
        
        // Read the queries until end-of-file
        while (scanner.hasNextLine()) {
            String query = scanner.nextLine();
            
            // Check if the query exists in the phone book
            if (phoneBook.containsKey(query)) {
                String phoneNumber = phoneBook.get(query);
                System.out.println(query + " = " + phoneNumber);
            } else {
                System.out.println("Entry Not found");
            }
        }
        
        scanner.close();
    }
}
