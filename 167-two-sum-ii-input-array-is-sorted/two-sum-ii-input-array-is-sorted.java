class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Approach: Two Pointer approach
        //TC:(n)| SC:(1)

        int l=0;//set left pointer
        int r=numbers.length-1;//set right pointer
        int[] sumPair=new int[2];
        while(l<r)
        {
            if(numbers[l]+numbers[r]==target)
            {
                return new int[] {l+1,r+1};
            }
            if(numbers[l]+numbers[r]>target)
                r--;
            else
                l++;
        }
        return null;
    }
}