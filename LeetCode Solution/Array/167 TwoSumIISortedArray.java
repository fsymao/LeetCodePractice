class Solution {
    public int[] twoSum(int[] nums, int target) {
    int p1=0;
    int p2=nums.length-1;
    while(p1!=p2)
    {
        int temp=nums[p1]+nums[p2];

        if (temp==target)
        {
            return new int[] {p1+1,p2+1};
        }
        else if(temp<target)
        {
            p1++;
        }
        else
        {
            p2--;
        }
    }
       return new int[] {};
    }
}
