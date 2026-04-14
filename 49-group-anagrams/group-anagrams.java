class Solution {
    public String getHash(String str){
        int[] arr = new int[26];
        StringBuilder temp = new StringBuilder();
        for(char ch : str.toCharArray()){
            arr[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            temp.append(arr[i]);
            temp.append('#');
        }
        return temp.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new LinkedList<>();
        Map<String, Integer> mp = new HashMap<>();
        for(String s : strs){
            String key = getHash(s);
            if(!mp.containsKey(key)){
                mp.put(key, res.size());
                res.add(new ArrayList<>());
            }
            res.get(mp.get(key)).add(s);
        }
        return res;
    }
}