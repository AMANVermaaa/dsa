class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int maxLen = 0;
        Map<Character, Integer> mp = new HashMap<>();

        for(int r=0;r<s.length();r++){
            char ch = s.charAt(r);

            if(mp.containsKey(ch)){
                l=Math.max(l,mp.get(ch)+1);
            }
            maxLen=Math.max(maxLen,r-l+1);
            mp.put(ch,r);
        }
        return maxLen;
    }
}