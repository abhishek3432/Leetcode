class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        int longestSequence=1;
        HashSet<Integer> sq= new HashSet<Integer>();
        for(int num: nums)
        {
            sq.add(num);
        }
        for(int num: nums)
        {
            if(!sq.contains(num-1))
            {
                int count=1;
                while(sq.contains(num+1))
                {
                    count++;
                    num++;
                }
                longestSequence=Math.max(longestSequence, count);
            }
            if(longestSequence>nums.length/2)
                break;
        }
        
        return longestSequence;
    }
}