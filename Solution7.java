// class Solution {
//     public int reverse(int x) {
//         int num=0;
        
//          while (x != 0) {
//                 int digit = x % 10;
//                 x=x/10; 
//                 num=num*10+digit;
//             }
        
        
//         if(num > Integer.MAX_VALUE - 1 || x < Integer.MIN_VALUE - 1){
         
//             return num;
            
//         }
//         else{
//           return 0;
            
//         }
        
//     }
    
//   public static void main (String[] args) {
//       Solution s= new Solution();
//       int res=s.reverse(1534236469);
//       System.out.println(res);
//     }
// }


class Solution {
    public int reverse(int x) {
        int num = 0;
        
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
        
            if (num > Integer.MAX_VALUE / 10 ||num < Integer.MIN_VALUE / 10)
           
             {
                 return 0;
             }
            num = num * 10 + digit;
        }
        
        return num;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int res = s.reverse(1534236469);
        System.out.println(res); 
    }
}
