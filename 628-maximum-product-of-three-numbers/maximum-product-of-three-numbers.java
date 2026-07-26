class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        if(n==3){
            return nums[0]*nums[1]*nums[2];

        }
        Arrays.sort(nums);
        int sum=1;
        
        return Math.max(nums[n-1]*nums[n-2]*nums[n-3],nums[0]*nums[1]*nums[n-1]);
        
        // for(int i=n-1;i>=n-3;i--){
        //     sum*=nums[i];

        // }
        // return sum;
        
        
    }
}