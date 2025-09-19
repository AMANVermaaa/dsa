class Solution {
    public String getFrequencyString(String s){
        int[] freq = new int[26];

        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder str= new StringBuilder("");
        char c = 'a';
        for(int i : freq){
            str.append(c);
            str.append(i);
            c++;
        }

        return str.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> frequencyMap = new HashMap<>();
        

        for(String s : strs){
            String frequencyString = getFrequencyString(s);

            if(frequencyMap.containsKey(frequencyString)){
                frequencyMap.get(frequencyString).add(s);

            }
            else{
                List<String> strlist = new ArrayList<>();
                strlist.add(s);
                frequencyMap.put(frequencyString,strlist);

            }


        }

        return new ArrayList<>(frequencyMap.values());
    }
}