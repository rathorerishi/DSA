class Solution {
    public int smallestIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            if(sdigits(nums[i])==i){
                return i;
            }
            
        }
        return -1;
        
    }
    public int sdigits(int n){
        int s=0;
        while(n>0){
            s+=n%10;
            n=n/10;
        }
        return s;

    }
}