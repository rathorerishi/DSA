class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = nums1[0], odd = 0;

        for(int i=0;i<nums1.length;i++) {
            min = Math.min(min, nums1[i]);
            odd |= nums1[i] & 1;
        }

        return (min & 1) == odd;
        
    }
}