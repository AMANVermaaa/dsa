class Solution {
    public int removeDuplicates(int[] nums) {
        int pos=0;
        nums[pos]=nums[0];
        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i]!=nums[i+1]){
                pos++;
            }
            nums[pos]=nums[i+1];
            
        }
        return pos+1;
    }
}