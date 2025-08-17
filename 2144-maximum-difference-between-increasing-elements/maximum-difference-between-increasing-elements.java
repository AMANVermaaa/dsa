class Solution {
    public int maximumDifference(int[] nums) {
        int diff= -1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int dif= nums[j]-nums[i];
                if(dif>0 && dif>diff){
                    diff=dif;
                }
            }
        }
        return diff;
    }
}