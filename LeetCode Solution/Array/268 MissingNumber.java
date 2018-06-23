class Solution {
    public int missingNumber(int[] nums) {
    Set <Integer> tempset =new HashSet<>();
    for(int i=0;i<nums.length;i++)
    {
        tempset.add(nums[i]);
    }
    for (int i=0;i<=nums.length;i++)
    {
     if(!tempset.contains(i)) return i;
    }
    return -1;
    }
}
