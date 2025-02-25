import java.util.*;

class Solution25 {
    public int findPeakElement(int[] nums) {
      int index=-1;
        int[] nums2=Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        int peak=nums[nums.length-1];
        //int index = Arrays.binarySearch(nums2, peak);
        for(int i=0;i<nums2.length;i++)
        {
          if(nums2[i]==peak)
          {
            index=i;
            break;
          }
        }
        
        return index;
    }
    public static void main(String a[])
    {
      Solution25 s=new Solution25();
      int[] nums={6,5,4,3,2,3,2};
      int res=s.findPeakElement(nums);
      System.out.println(res);
    }
}
