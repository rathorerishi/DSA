class Solution {
    public int longestOnes(int[] nums, int k) {
         int left=0, right =0;
        int len =0 ;
        int maxlen = Integer.MIN_VALUE;
        while(right<nums.length){
            if(nums[right]==0){
                k--;
            }
            while (k < 0) {
                 if (nums[left] == 0)
                    k++;      // returned one flip
               left++;
            }
            len = right- left +1;
            maxlen = Math.max(len,maxlen);
            right++;
        }
        return maxlen;

        
    }
}