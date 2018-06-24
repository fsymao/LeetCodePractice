class Solution {
    public int searchInsert(int[] nums, int target) {
    // for(int i=0;i<nums.length;i++)
    // {
    // if(nums[i]==target) return i;
    // if(nums[i]>target) return i;
    // }
    // return nums.length;
    if(nums==null || nums.length==0) return 0;
    int head=0;
    int end=nums.length-1;
    while(head<=end)
    {
        int middle = (int) (head+end)/2;
        if(nums[middle]==target) return middle;

        else if(nums[middle]>target)
           {
               end=middle-1;
           }
        else
           {
               head=middle+1;
           }
    }
           return end+1;


    }
}
