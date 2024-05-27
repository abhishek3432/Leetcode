class Solution {
    public int removeDuplicates(int[] nums) {
        //Approach: Two Pointer
        //TC:O()| SC:O(1)
        int n=nums.length;
        int l=0;
        int r=0;
        while(r<n){
            int cnt=1;
            while(r+1<n && nums[r]==nums[r+1]){
                r++;
                cnt++;
            }
            for(int i=0; i<Math.min(2,cnt); i++){
                nums[l]=nums[r];
                l++;
            }
            r++;
        }
        return l;
    }
}