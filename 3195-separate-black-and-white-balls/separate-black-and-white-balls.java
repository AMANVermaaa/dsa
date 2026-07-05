class Solution {
    public long minimumSteps(String s) {
        long res= 0;
        char[] ch = s.toCharArray();
        int ones=0;
        for(char c:ch){
            if(c=='1'){
                ones++;
            }
            else{
                res+=ones;
            }
        }
        return res;
    }
}