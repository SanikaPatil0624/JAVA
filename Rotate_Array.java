import java.util.*;
class Rotate_Array {
    public void rotate(int[] arr, int k) {
        while (k != 0)
        {
            int lastElement = arr[arr.length - 1];
            
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            
            arr[0] = lastElement;
            k--;
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void main(String args[])
    {
        Rotate_Array s = new Rotate_Array();
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        s.rotate(arr, k);
    }
}
