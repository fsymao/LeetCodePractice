class Solution {
    public int findShortestSubArray(int[] nums) {
     Map<Integer, Integer> count= new HashMap<>(), left= new HashMap<>(), right= new HashMap<>();
     for (int i=0;i<nums.length;i++)
     {
         if(count.containsKey(nums[i]))
         {
             count.put(nums[i], count.get(nums[i])+1);
         }
         else
         {
              count.put(nums[i], 1);
         }
         if(!left.containsKey(nums[i])) left.put(nums[i],i);
         right.put(nums[i],i);
     }
     int ans = nums.length;
     int degree = Collections.max(count.values());
     for(int x: count.keySet())
     {
         if(count.get(x)==degree)
         {
             ans=Math.min(ans,right.get(x) - left.get(x) + 1);
         }
     }
      return ans;
    }
}
