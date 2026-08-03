class Solution {
    public int findDuplicate(int[] nums) {
        // Set<Integer> set = new HashSet<>();
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     if (!set.add(nums[i])) {
        //         return nums[i];
        //     }
        // }

        // return n;
        int slow=0;
        int fast=0;
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];

        }
        while(slow!=fast);
        fast=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
            
        }
        return fast;

        
        
    }
}