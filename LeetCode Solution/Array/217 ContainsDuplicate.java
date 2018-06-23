class Solution {
    public boolean containsDuplicate(int[] nums) {
    Set <Integer> tempset= new HashSet<Integer>();
    for (int i=0; i<nums.length;i++)
    {
        if(tempset.contains(nums[i]))
            return true;
        else
            tempset.add(nums[i]);
    }
    return false;
    }
}
