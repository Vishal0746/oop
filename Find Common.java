import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        int[] commonElements = findCommonElements(array1, array2);

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Common Elements: " + Arrays.toString(commonElements));
    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        // Convert array1 to a set
        Set<Integer> set1 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }

        // Find common elements in array2
        List<Integer> commonElements = new ArrayList<>();
        for (int num : array2) {
            if (set1.contains(num)) {
                commonElements.add(num);
            }
        }

        // Convert the list to an array
        int[] result = new int[commonElements.size()];
        for (int i = 0; i < commonElements.size(); i++) {
            result[i] = commonElements.get(i);
        }

        return result;
    }
}
