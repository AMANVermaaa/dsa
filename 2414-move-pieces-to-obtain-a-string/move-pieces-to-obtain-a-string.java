class Solution {
    public boolean canChange(String s, String t) {
        int i =0;
        int n =s.length();
        int j =0;

        while(i<n || j<n){
            while(i<n && s.charAt(i)=='_') i++;
            while(j<n && t.charAt(j)=='_') j++;

            if(i==n || j==n) return i==n && j==n;

            if(s.charAt(i)!=t.charAt(j)) return false;
            if(s.charAt(i)=='L' && i<j) return false;
            if(s.charAt(i)=='R' && i>j) return false;

            i++;j++;
        }
        return true;
    }
}