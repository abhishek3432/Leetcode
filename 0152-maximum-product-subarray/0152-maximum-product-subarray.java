class Solution {
    public int maxProduct(int[] nums) {
        int prefix=1;
        int suffix=1;
        int n=nums.length;
        int maxSubArray=Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            if(prefix==0)   prefix=1;
            if(suffix==0)   suffix=1;
            prefix*=nums[i];
            suffix*=nums[n-1-i];
            maxSubArray=Math.max(maxSubArray,Math.max(prefix,suffix));
        }
        
        return maxSubArray;
    }
}