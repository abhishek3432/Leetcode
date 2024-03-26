class Solution {
    public int[] shuffle(int[] nums, int n) {
        //time complexity: O(n)
        //space complexity: O(n)
        int[] shuffleArray=new int[2*n];

        for(int i=0; i<n; i++)
        {
            shuffleArray[2*i]=nums[i];
            shuffleArray[2*i+1]=nums[n+i];
        }
        return shuffleArray;
    }
}