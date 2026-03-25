class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> mp = new HashMap<>();

        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            if(mp.containsKey(s.charAt(i))) mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            else mp.put(s.charAt(i),1);
        }

        for(int i=0;i<t.length();i++){
            if(mp.containsKey(t.charAt(i))) mp.put(t.charAt(i),mp.get(t.charAt(i))-1);
            else return false;
        }
        for(int i=0;i<t.length();i++){
            if(mp.get(s.charAt(i))<0){
                return false;
            }
        }
        return true;
    }
}