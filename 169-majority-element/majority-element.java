class Solution {
    public int majorityElement(int[] nums) {
        int cand = 0;
        int vote = 0;

        for(int num: nums){
            if(vote == 0) {
                cand = num;
                vote++;
            }
            else if(num == cand) vote++;
            else vote--;
        }

        // int count = 0;
        // for(int num: nums){
        //     if(num==cand){
        //         count++;
        //     }
        // }

        // if(count > nums.length/2) return cand;
        // return 

        return cand;
    }
}