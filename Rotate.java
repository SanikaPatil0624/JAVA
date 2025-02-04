import java.util.*;
class Rotate {
    public void rotate(int[] nums, int k) {
        int index = 0;
        int size = nums.length;
        int start = size - k;
        int[] arr = new int[size];
        for (int i = start; i < nums.length; i++)
        {
            arr[index] = nums[i]; 
            index++;

        }
        for (int i = 0; i < start; i++)
        {
            arr[index] = nums[i];
            index++;
        }
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String a[])
    {
        Rotate s = new Rotate();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        s.rotate(nums, k);
    }
}
