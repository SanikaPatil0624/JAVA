import java.util.*;
class Solution10 {
    public double myPow(double x, int n) {
        double res=Math.pow(x,n);
        return res;
    }
    public static void main(String a[])
    {
        Solution s=new Solution();
        double x=2.00000;
        int n=10;
        double out=s.myPow(x,n);
        System.out.println(out);
    }
}
