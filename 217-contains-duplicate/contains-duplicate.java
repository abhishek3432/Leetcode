class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        //OptimizedApproach: Create HashTable and insert element and if element exist return true for duplicity | TIME:O(n) | SPACE:O(n) 
        boolean containDuplicate=false;
        Set<Integer> noDuplicate= new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            if(noDuplicate.contains(nums[i]))
                containDuplicate=true;
            noDuplicate.add(nums[i]);
        }
        return containDuplicate;
    }
}