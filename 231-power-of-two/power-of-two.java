class Solution {
    public boolean isPowerOfTwo(int n) {
        // int i=1;
        // while(i<=n){
        //     if(i==n)
        //         return true;
        //     i=i<<1;
        // }
        // return false;

        if((n>0)&&(n & (n-1))==0)
            return true;
        return false;
    }
}