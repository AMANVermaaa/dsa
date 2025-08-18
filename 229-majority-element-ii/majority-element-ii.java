class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1 = -1;
        int votes1=0;
        int candidate2 = -1;
        int votes2=0;

        for(int num:nums){
            if(candidate1 == num) votes1++;
            else if(candidate2 == num) votes2++;
            else if(votes1==0) {candidate1=num;  votes1++;}
            else if(votes2==0) {candidate2=num;  votes2++;}
            else {votes1--; votes2--;}
        }

        int count1=0;
        int count2=0;
        for(int num: nums){
            if(candidate1==num) count1++;
            else if(candidate2==num) count2++;
        }
        List<Integer> ls = new ArrayList<>();

        if(count1>nums.length/3) ls.add(candidate1);
        if(count2>nums.length/3) ls.add(candidate2);
        
        return ls;
    }
}