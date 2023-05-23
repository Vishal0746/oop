import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Iterator Loop:");
        // Iterate using iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Advanced For Loop:");
        // Iterate using advanced for-loop
        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println("For Loop:");
        // Iterate using for-loop
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
