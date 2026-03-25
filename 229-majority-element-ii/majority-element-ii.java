class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int v1 =0;
        int cand1=0;
        int v2= 0;
        int cand2=0;

        for(int num:nums){
            if(cand1==num) v1++;
            else if(cand2==num) v2++;
            else if(v1==0) {cand1=num;v1=1;}
            else if(v2==0) {cand2=num;v2=1;}
            else {v1--; v2--;}
        }

        int cnt1=0;
        int cnt2=0;

        for(int num:nums){
            if(num==cand1) cnt1++;
            else if(num==cand2) cnt2++;
        }
        System.out.println(cand1);
                System.out.println(cand2);
        if(cnt1>nums.length/3) list.add(cand1);
        if(cnt2>nums.length/3) list.add(cand2);

        return list;
    }
}