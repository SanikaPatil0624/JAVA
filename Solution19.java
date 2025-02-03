import java.util.*;
class Solution19 {
    public void sortColors(int[] nums) {
          Arrays.sort(nums);
           System.out.println(Arrays.toString(nums));
    }
    public static void main(String a[])
    {
        Solution19 s=new Solution19();
        int[] nums={2,0,2,1,1,0};
        s.sortColors(nums);
    }
}
