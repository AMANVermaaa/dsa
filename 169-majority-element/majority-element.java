class Solution {
    public int majorityElement(int[] nums) {
        int vote=0;
        int cand=0;
        for(int i:nums){
            if(vote==0) {
                vote=1;
                cand=i;
            }
            else if(cand==i) vote++;
            else if(cand!=i) vote--;

        }
        return cand;
    }
}