import java.util.*;
class Solution20 {
    public void rotate(int[] arr, int order) {
        order = order % arr.length;
        if (arr == null || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
        //length of first part
        int a = arr.length - order;
        reverse(arr, 0, a - 1);
        reverse(arr, a, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        
        System.out.print(Arrays.toString(arr));
    }
    public static void reverse(int[] arr, int left, int right) {
        if (arr == null || arr.length == 1)
            return;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String args[])
    {
        Solution20 s = new Solution20();
    int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        s.rotate(arr, k);
    }
}
