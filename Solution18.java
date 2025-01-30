import java.lang.Math; 
class Solution18 {
    public int mySqrt(int x) {
        int z=(int)Math.sqrt(x);
        return z;
    }
    public static void main(String a[])
    {
        Solution18 s= new Solution18();
        int num=4;
        int res=s.mySqrt(num);
        System.out.println(res);
    }
}
