class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      //fill in from right to left
      if(nums1.length<m+n)
          return;
      if(m==0)
      {
          for(int i=n-1;i>=0;i--)
      {
              nums1[i]=nums2[i];
          }

      }
      int n1pos=m-1;
      int pos=nums1.length-1;
      for(int i=n-1;i>=0;i--)
      {
         if(n1pos==-1)
         {
             nums1[pos]=nums2[i];
         }
         else if(nums2[i]>=nums1[n1pos])
         {
            nums1[pos]=nums2[i];
         }
         else
         {
          while( nums2[i]<nums1[n1pos] )
          {
              nums1[pos]=nums1[n1pos];
              pos-=1;
              if(n1pos==0) {
                 n1pos-=1;
                break;}
              else
              {n1pos-=1;}
          }
            nums1[pos]=nums2[i];
         }
         pos-=1;
      }
      return;
    }
}
