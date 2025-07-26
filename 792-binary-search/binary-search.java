class Solution {
    public int search(int[] nums, int target) {
        
        // int low =0;
        // int high=nums.length-1;

        // while(low<=high){

        //     int mid = (low+high)/2;

        //     if(nums[mid]==target){
        //         return mid;
        //     }
        //     else if(nums[mid]<target){
        //         low=mid+1;
        //     }
        //     else high= mid-1;

        // }
        // return -1;


        return binary(nums,0,nums.length-1,target);
    }

    public static int binary(int[] nums, int low, int high,int target){

        if(low>high){
            return -1;
        }
        
        int mid=(low+high)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]<target) return binary(nums, mid+1, high, target);
        else return binary(nums, low, mid-1, target);
        

        
    }
}