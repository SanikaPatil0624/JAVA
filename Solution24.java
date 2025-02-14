import java.util.Arrays;

public class Solution24 {

     public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        double res;
        int[] mergedArray = new int[arr1.length + arr2.length];
        
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }
        
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[arr1.length + i] = arr2[i];
        }
        
        Arrays.sort(mergedArray);
         int n = mergedArray.length;
         
        if (n % 2 != 0) {
          
            return mergedArray[n / 2];
        } else {
          
           
             return (mergedArray[(n / 2) - 1] + mergedArray[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
       int[] arr1 = {1, 2 };
        int[] arr2 = {3, 4};

        
        Solution24 obj = new Solution24();

        
        double result = obj.findMedianSortedArrays(arr1, arr2);

      
        System.out.println("Median: " + result); 
    }
    
}
