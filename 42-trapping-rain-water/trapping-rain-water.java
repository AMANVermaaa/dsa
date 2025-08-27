class Solution {
    
    
    public int trap(int[] height) {
        int units=0;
        int n=height.length;
        int i=1;
        int[] leftMax=new int[n];
        int[] rightMax=new int[n];

        leftMax[0]=0;
        rightMax[n-1]=0;
        for(int j=1;j<n;j++){
            leftMax[j]=Math.max(leftMax[j-1],height[j-1]);
        }
        for(int j=n-2;j>=0;j--){
            rightMax[j]=Math.max(rightMax[j+1],height[j+1]);
        }
        while(i<height.length-1){

            

            units+=Math.max(Math.min(leftMax[i],rightMax[i])-height[i],0);

            i++;
        }
        return units;
    }
    
}