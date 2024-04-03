class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        int[] sumPair=new int[2];
        while(l<r)
        {
            if(numbers[l]+numbers[r]==target)
            {
                sumPair[0]=l+1;
                sumPair[1]=r+1;
            }
            if(numbers[l]+numbers[r]>target)
                r--;
            else
                l++;
        }
        return sumPair;
    }
}