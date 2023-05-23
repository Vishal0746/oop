import java.util.HashSet;

public class Main23 {
    public static int findLongestConsecutiveSequence(int[] nums) {
        // Create a HashSet to store all the numbers in the array
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        // Iterate through each number in the array
        for (int num : nums) {
            // Check if the current number is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Count the length of the consecutive sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                // Update the maxLength if necessary
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {49, 1, 3, 200, 2, 4, 70, 5};
        int longestSequenceLength = findLongestConsecutiveSequence(nums);
        System.out.println("The longest consecutive elements sequence length is: " + longestSequenceLength);
    }
}
