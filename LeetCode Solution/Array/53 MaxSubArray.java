class Solution {
    public int maxSubArray(int[] nums) {
      int max = Integer.MIN_VALUE, sum = 0;
      for (int i=0;i<nums.length;i++)
      {
          if(sum<0)
          {
              sum= Math.min(sum,nums[i]);
          }
          else
          {
              sum+=nums[i];
          }
          if(sum>max)
          {max=sum;}
      }
    return sum;
    }
}

// class Solution {
//     public int maxSubArray(int[] nums) {
//         if(nums.length==0)
//             return 0;
//         else if(nums.length==1)
//             return nums[0];
//         else
//         {
//             int max_sum = nums[0];
//             int consecutive_sum = nums[0];
//             for(int i=1;i<nums.length;i++)
//             {
//                 if(consecutive_sum+nums[i]<nums[i])
//                     consecutive_sum=nums[i];
//                 else
//                    consecutive_sum=consecutive_sum+nums[i];

//                 if(consecutive_sum>max_sum)
//                     max_sum=consecutive_sum;
//             }
//             return max_sum;
//         }
//     }
// }
