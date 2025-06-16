class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int b=nums.length-1;
        while(i<b){
            if(nums[i]%2==1 && nums[b]%2==0){
                int temp=nums[i];
                nums[i++]=nums[b];
                nums[b--]=temp;
            }
            if(nums[i]%2==0) i++;
            if(nums[b]%2==1) b--;
        }
        return nums;
    }
}