class Solution {
    public int majorityElement(int[] nums) {
        int candidate =0;
        int votes =0;

        for(int i=0;i<nums.length;i++){
            
            if(votes==0) {
                candidate=nums[i];
                votes++;
            }
            else {
                if(candidate == nums[i]) votes++;
                else votes--;
            }
        }
        return candidate;
    }
}