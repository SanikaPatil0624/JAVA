class Solution7 {
    public int reverse(int x) {
        int num=0;
       while (x != 0) {
            int digit = x % 10;
            x=x/10; 
            num=num*10+digit;
        }
        return num;
    }
    
   public static void main (String[] args) {
      Solution s= new Solution();
      int res=s.reverse(123);
      System.out.println(res);
    }
}
