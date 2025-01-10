class Solution6 {
    public int searchInsert(int[] nums, int target) {
      int flex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
            {
                flex++;
                return i;
            }
            
        }
       
       if(flex==0){
        for(int i=0;i<nums.length;i++){
          if(nums[i]>target)
          {
            return i;
          }
        }
       } 
        return nums.length;
    }
    public static void main(String a[])
    {
        Solution s=new Solution();
        int[] nums = {1,3,5,6};
        int target = 4;
        int res= s.searchInsert(nums,target);
        System.out.print(res);

    }
}
