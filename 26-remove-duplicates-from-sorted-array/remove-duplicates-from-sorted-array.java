class Solution {
    public void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length;

        while(j<n){
            if(nums[i]!=nums[j]){
                i++;
                swap(nums,i,j);
                j++;
            }
            else j++;
        }
        return i+1;
    }
}