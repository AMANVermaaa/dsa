class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int cand1 = -1;
        int vote1 = 0;
        int cand2 = -1;
        int vote2 = 0;

        for(int num: nums){
            if(cand1 == num) vote1++;
            else if(cand2 == num) vote2++;
            else if(vote1 == 0) {cand1 = num; vote1++;}
            else if(vote2 == 0) {cand2 = num; vote2++;}
            else {vote1--; vote2--;}
        }

        int cnt1 = 0;
        int cnt2 = 0;

        for(int num: nums){
            if(cand1 == num) cnt1++;
            else if(cand2 == num) cnt2++;
        }
        
        List<Integer> res = new ArrayList<>();

        if(cnt1>nums.length/3) res.add(cand1);
        if(cnt2>nums.length/3) res.add(cand2);

        return res;
    }
}