class Solution {
    public int removeDuplicates(int[] nums) {
    if(nums.length==0) return 0;
    int pos=1;
    int num=nums[0];
    for(int i=1;i<nums.length;i++)
    {
        if(nums[i]!=num)
        {
            nums[pos]=nums[i];
            num=nums[i];
            pos+=1;
        }
    }
     return pos;

    }
}
