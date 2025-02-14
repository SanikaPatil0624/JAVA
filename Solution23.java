
import java.util.Arrays;

public class Solution23 {
    public int firstMissingPositive(int[] nums) {
        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Find the first missing positive integer
        int missing = 1; // The smallest positive integer we are looking for
        
        for (int num : nums) {
            if (num == missing) {
                missing++; // Increment missing if the number matches the current missing
            }
        }

        return missing; // Return the first missing positive integer
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case
        int[] nums = {3, 4, -1, 1};
        System.out.println("First missing positive: " + solution.firstMissingPositive(nums)); // Output: 2
    }
}
