class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        if(target < nums[0])
            return 0;
        if(target>nums[n-1])
            return n;
        int l=0;
        int r=n-1;
        int m=l+(r-l)/2;;
        while(l<=r)
        {
            m=l+(r-l)/2;
            if(target==nums[m])
                return m;
            else if(target>nums[m])
                l=m+1;
                else
                    r=m-1;
        }
        if(target>nums[m])
            return m+1;
        else  return m;
    }
}