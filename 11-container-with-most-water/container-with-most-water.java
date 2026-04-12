class Solution {
    public int maxArea(int[] height) {
        int h = height.length;
        int i = 0;
        int j = h-1;
        int maxArea=0;
        while(i<j){
            maxArea=Math.max(maxArea,Math.min(height[i],height[j])*(j-i));
            if(height[i]<height[j]) i++;
            else j--;
        }
        return maxArea;
    }
}