//1929. Concatenation of Array
class Solution {
    public int[] getConcatenation(int[] nums) {
        // BruteforceApproach: traverse whole array of length 2*n and put value at
        // current index with some logic
        // TC:(2*n)| SC:(n)
        int n = nums.length;
        int m = 2 * n;
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            ans[i] = nums[i % n];
        }

        return ans;
    }
}