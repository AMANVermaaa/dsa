class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int i=0;
        int j=0;
        int k=0;
        StringBuilder str = new StringBuilder();
        while(i<Math.min(n,m)*2){
            if(i%2==0) str.append(word1.charAt(j++));
            else str.append(word2.charAt(k++));
            i++;
        }
        while(j<n){
            str.append(word1.charAt(j++));
        }
        while(k<m){
            str.append(word2.charAt(k++));
        }
        return str.toString();
    }
}