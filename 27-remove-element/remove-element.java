class Solution {
    public int removeElement(int[] nums, int val) {
       int n=nums.length;
       int i=0;
       while(i<n)
       {
            if(nums[i]==val)
            {
                int swap=nums[i];
                nums[i]=nums[n-1];
                nums[n-1]=swap;
                n--;
            }
            else
                i++;
       }
       return i;
    }
}