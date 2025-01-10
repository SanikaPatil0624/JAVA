class Solution5 {
    public int removeDuplicates(int[] nums) {
        int k = 0; // Index to store unique elements

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) { // If it's the first element or different from the previous one
                nums[k] = nums[i]; // Store the unique element at index k
                k++; // Increment k
            }
        }

        return k; // Return the count of unique elements
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {1, 1, 2};
        int k1 = solution.removeDuplicates(nums1);
        System.out.println("Output: " + k1); // Output: 2
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " "); // Output: 1 2
        }
        System.out.println();

        // Example 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("Output: " + k2); // Output: 5
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " "); // Output: 0 1 2 3 4
        }
    }
}
