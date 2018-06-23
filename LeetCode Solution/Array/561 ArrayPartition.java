class Solution {
    public int arrayPairSum(int[] nums) {

    // for (int i=0;i<nums.length-1;i++)
    // {
    //     for (int j=i+1;j<nums.length;j++)
    //     {
    //         if(nums[i]>nums[j])
    //         {
    //             int temp=nums[j];
    //             nums[j]=nums[i];
    //             nums[i]=temp;
    //         }
    //     }
    // }
    Arrays.sort(nums);
    int count=0;
    for (int i=0;i<nums.length;i++)
    {
        if(i%2==0)
            count+=nums[i];
    }
    return count;
 }
}
