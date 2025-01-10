class Solution4 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) { 
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution"); // If no solution is found
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = {3, 2, 4};
        int target1 = 6; // Changed target to 6 for a valid test case
        int[] result = s.twoSum(nums1, target1);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
