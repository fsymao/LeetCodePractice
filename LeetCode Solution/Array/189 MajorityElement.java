class Solution {
    public int majorityElement(int[] nums) {
    if (nums.length==1) return nums[0];
    Map<Integer, Integer> hmap_num = new HashMap<Integer, Integer>();
    for (int i=0;i<nums.length;i++)
    {
    if(hmap_num.containsKey(nums[i]))
    {
        int temp=hmap_num.get(nums[i]);
        if(temp+1>nums.length/2)
            return nums[i];
        hmap_num.put(nums[i],temp+1);
    }
    else
    {
        hmap_num.put(nums[i],1);
    }

    }
    return 0;
    }
}
