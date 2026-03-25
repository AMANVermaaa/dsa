class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        // Step 1: Find the first decreasing element from the end
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        // If no such element exists, reverse the whole array
        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        // Step 2: Find the next larger element to swap with
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }
        // Step 3: Reverse the part after index
        reverse(nums, index + 1, n - 1);
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private void reverse(int[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }
}