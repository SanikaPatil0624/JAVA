import java.util.Arrays;

class Solution9 {
    public int removeElement(int[] nums, int val) {
        int k = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; 
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 2, 6, 0};
        int val = 2;
        int k = solution.removeElement(nums, val);
        System.out.println("Number of valid elements: " + k);
        System.out.println("Resulting Array: ");
        for (int i = 0; i < nums.length; i++) {
            if(i<k)
            {
            System.out.print(nums[i] + " ");
            }
            else{
            System.out.print(" _");
            }
            
        }
    }
}
