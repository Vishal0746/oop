import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 4, 7, 8, 3};

        int[] result = removeDuplicates(array);

        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array without Duplicates: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] array) {
        // Convert the array to a List
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }

        // Use a HashSet to store unique elements
        Set<Integer> set = new HashSet<>(list);

        // Convert the set back to an array
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }
}
