//27. Remove Element
class Solution {
    public int removeElement(int[] nums, int val) {
       //Approach:Use Two pointer and swap val to last value of array
       //TC:(n)| SC:(1)
       int n=nums.length;
       int i=0;
       while(i<n)
       {
            //check curval==val then swap reduce pointer to last second
            if(nums[i]==val)
            {
                int swap=nums[i];
                nums[i]=nums[n-1];
                nums[n-1]=swap;
                n--;
            }
            else
                i++;//if not same move to next element
       }
       return i;
    }
}