//1470. Shuffle the Array
class Solution {
    public int[] shuffle(int[] nums, int n) {
        // Approach: Take given array and put two pointer at 0 and n position and create
        // 2*n array and increament i+=2
        // TC:(n)| SC:(n)
        
        // OptimizedApproach: Using Bitwise operator
        // TC:(n)| SC:(1)
        for (int i = 0; i < n; i++) {
            // shifting x 10bit left
            nums[i] = nums[i] << 10;
            // storing x and y together
            nums[i] |= nums[n + i];
        }
        // points end of arr
        int j = 2 * n - 1;
        for (int i = n - 1; i >= 0; i--) {
            int y = nums[i] & (int) (Math.pow(2, 10) - 1);// get value 1 till 10 bit
            int x = nums[i] >> 10;
            nums[j--] = y;
            nums[j--] = x;
        }
        return nums;
    }
}