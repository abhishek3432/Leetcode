//704. Binary Search
class Solution {
    public int search(int[] nums, int target) {
        //Approach: Using Binary Search Algorithm
        //TC:O(log n)| SC:O(1)
        int l = 0;
        int r = nums.length-1;
        while(l<=r)
        {
            int m= l+(r-l)/2;
            if(target>nums[m])
                l=m+1;
            else if(target<nums[m])
                r = m-1;
                else
                    return m;
        }
        return -1;

    }
}