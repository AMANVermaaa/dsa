class Solution {
    public boolean isPalindrome(int x) {
        int copy=x;
        int num=0;
        while(copy>0){
            int digit=copy%10;
            copy/=10;
            num= (num*10)+digit;
        }
        
        if(x==num){
            return true;
        }
        return false;
    }
}