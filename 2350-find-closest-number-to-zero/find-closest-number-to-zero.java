class Solution {
    public int findClosestNumber(int[] nums) {
        int num=nums[0];
        for(int i=1;i<nums.length;i++){
            if(Math.abs(num)>Math.abs(nums[i]) || Math.abs(num)==Math.abs(nums[i]) && nums[i]>num )
                num=nums[i];
        }

        return num;
    }
}