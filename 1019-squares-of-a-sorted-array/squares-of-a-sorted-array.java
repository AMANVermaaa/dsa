class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        int[] result = new int[nums.length];

        for(int i=right;i>=0;i--){
            if(Math.abs(nums[right])>Math.abs(nums[left])){
                result[i]=(int)Math.pow(nums[right],2);
                right--;
            }
            else {
                result[i]=(int)Math.pow(nums[left],2);
                left++;
            }
        }
        return result;
    }
}