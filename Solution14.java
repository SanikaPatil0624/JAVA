import java.util.*;
class Solution14 {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==target)
                  return true;
                
            }
        }
         return false;
    }

    public static void main(String a[])
    {
        Solution s=new Solution();
        int[][] matrix={{1,3},{5,6}};
        int target=6;
        boolean res =s.searchMatrix(matrix,target);
        System.out.println(res);
    }
}
