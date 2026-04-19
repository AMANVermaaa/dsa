class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int left = 0;
        int right = 0;
        int maxi=0;
        int zeros=0;

        while(right<nums.length){
            if(nums[right]==0) {
                zeros++;
            }
            if(zeros>k){
                if(nums[left]==0) zeros--;
                left++;
            }
            maxi=Math.max(maxi,right-left+1);
            right++;
        }
        return maxi;

    }
}