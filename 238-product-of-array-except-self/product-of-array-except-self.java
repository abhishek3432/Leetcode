class Solution {
    

    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int prefix=1;
        for(int i=0; i<nums.length; i++)
        {
            ans[i]=prefix;
            prefix*=nums[i];
        }
        int postfix=1;
        for(int j=nums.length-1; j>=0; j--)
        {
            ans[j]*=postfix;
            postfix*=nums[j];
        }
        return ans;
    }
}