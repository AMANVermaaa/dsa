class Solution {
    public void reverseString(char[] s,int left, int right) {
        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public String reverseStr(String s, int k) {
        int i = 0;
        char[] str = s.toCharArray();

        while(i<s.length()) {
            reverseString(str,i,Math.min(s.length()-1,k+i-1));
            i+=2*k;
        }

        return new String(str);
    }
}