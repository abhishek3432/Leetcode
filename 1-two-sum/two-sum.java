class Solution {
    public int[] twoSum(int[] nums, int target) {

        //OptimizedApproach: insert element in hashtable with condition that target-element exist then return both element index| TC:(n)| SC:(n)
        
        HashMap<Integer, Integer> ans= new HashMap<>();
        for(int first=0; first<nums.length; first++)
        {
            int second=target-nums[first];
            if(ans.containsKey(second))
                return new int[] {first,ans.get(second)};
            ans.put(nums[first],first);
        }
        return new int[] {};
    }
}