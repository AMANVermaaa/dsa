class Solution {
    public void nextPermutation(int[] nums) {
        
        int n= nums.length;

        int i =n-1;

        while(i>0){
            if(nums[i] > nums[i-1]){
                break;
            }
            i--;
        }

        if(i==0){
            reverse(nums, i, n-1);
            return;
        }

        int j = n-1;
        while(j>=i){
            if(nums[j]>nums[i-1]){
                break;
            }
            j--;
        }

        swap(nums, i-1, j);
        reverse(nums,i,n-1);

    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void reverse(int[] nums, int left, int right){
        while(left<=right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}