class Solution {
    public int[] shuffle(int[] nums, int n) {
        //| TC:(n)| SC:(1)
       for(int i=0; i<n; i++)
       {
            nums[i] =nums[i]<<10;//shifting x 10bit left
            nums[i] |=nums[n+i]; //storing x and y together
       }
       int j=2*n-1;
       for(int i=n-1; i>=0; i--)
       {
            int y=nums[i]&(int)(Math.pow(2,10)-1);
            int x=nums[i]>>10;
            nums[j--]=y;
            nums[j--]=x;
       }
       return nums;
    }
}