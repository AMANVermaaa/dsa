class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxi =0;

        while(left < right){
            maxi = Math.max(maxi,Math.min(height[left],height[right])*(right-left));
            if(height[left] < height[right]){
                left++;
            }
            else right--;
        }

        return maxi;
    }
}