class Solution {
    public int[] getConcatenation(int[] nums) {
        //BruteforceApproach: traverse whole array of length 2*n and put value at current index with some logic
        //TC:(2*n)| SC:(n) 
 
       //OptimizedApproach: traverse only n time and put value at current index
       //TC:(n)| SC:(n)
        int n=nums.length;
        int[] ans= new int[2*n];
        for(int i=0; i<n; i++)
        {
            ans[i]=nums[i];
            ans[n+i]=nums[i];
        }

        return ans;
    }
}