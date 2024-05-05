//74. Search a 2D Matrix
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //BruteforceApproach: Traverse every element and compare
        //TC:O(m*n)| SC:O(1)
        
        //Approach: Trave every row and at each row apply Binary Algorithm 
        //TC:O(m*log n)| SC:O(1)

        //OptimizedApproach: Traverse every element and compare
        //TC:O(log m*n)| SC:O(1)
        if(matrix.length==0)
            return false;
        int row= matrix.length;
        int col=matrix[0].length;

        int l=0;
        int r=row*col;
        while(l<r)
        {
            int m=l+(r-l)/2;
            if(target==matrix[m/col][m%col])
                return true;
            else if(target<matrix[m/col][m%col])
                    r=m;
                else
                    l=m+1;
        }
        
        return false;
    }
}