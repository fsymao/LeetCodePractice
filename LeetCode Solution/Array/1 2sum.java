class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> maptemp= new HashMap<>();
    for (int i=0;i<nums.length;i++)
    {
        maptemp.put(nums[i],i);
    }
    for (int i =0;i<nums.length;i++)
        {
            int value= target- nums[i];
            if(maptemp.containsKey(value) && maptemp.get(value)!=i){
                return new int[] {i, maptemp.get(value)};
            }
        }

    throw new IllegalArgumentException("No two sum solution");
    }
}
