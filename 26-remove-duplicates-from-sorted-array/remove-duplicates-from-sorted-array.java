//26. Remove Duplicates from Sorted Array
class Solution {

    public int removeDuplicates(int[] nums) {
        // OptimzedApproach:Two pointer traversing
        // array adjacent and comparing with condition
        // TC:(n)| SC:(1)
        int p1 = 0;

        for (int p2 = 1; p2 < nums.length; p2++) {
            //getting position of element to place
            if (nums[p1] != nums[p2]) {
                p1++;
                //place element at desired place
                nums[p1] = nums[p2];
            }
        }

        return p1 + 1;
    }
}
