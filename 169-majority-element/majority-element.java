class Solution {
    public int majorityElement(int[] nums) {
        int cand = 0;
        int vote = 0;

        for(int i: nums){
            if(vote==0){
                cand = i;
                vote++;
            }
            else if(cand == i){
                vote++;
            }
            else{
                vote--;
            }
        }
        
        return cand;
    }
}