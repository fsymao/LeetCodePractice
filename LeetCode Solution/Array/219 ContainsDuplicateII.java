class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    Set <Integer> tempset=new HashSet <>();
    for (int i=0;i<nums.length;i++)
    {
     if (tempset.contains(nums[i])) return true;
     tempset.add(nums[i]);
     if(tempset.size()>k)
     {
         tempset.remove(nums[i-k]);
     }
    }

    return false;
    }
}
