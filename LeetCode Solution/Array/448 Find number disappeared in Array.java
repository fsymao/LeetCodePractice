class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List <Integer> newlist= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int idx=(nums[i]-1)%n;
            nums[idx]+=n;
        }

        for(int i=0;i<n;i++)
        {
            if(nums[i]<=n)
            {
                newlist.add(i+1);
            }
        }

    return newlist;
}
}
