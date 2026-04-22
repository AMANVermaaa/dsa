class Node{
    Node[] lists;
    boolean flag;
    Node(){
        lists = new Node[26];
        flag = false;
    }
}
class Trie{
    Node root;
    Trie(){
        root = new Node();
    }

    void insert(String s){
        Node node = root;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(node.lists[ch-'a']==null){
                node.lists[ch-'a']=new Node();
            }
            node = node.lists[ch-'a'];
        }
        node.flag = true;
    }

    boolean check(String s) {
        return dfs(root, s, 0, 0);
    }

    private boolean dfs(Node node, String s, int index, int mismatch) {
        // If mismatches exceed 2 → stop
        if (mismatch > 2) return false;

        // If reached end of word
        if (index == s.length()) {
            return node.flag;
        }

        char ch = s.charAt(index);

        // Try all 26 possibilities
        for (int i = 0; i < 26; i++) {
            if (node.lists[i] != null) {
                int newMismatch = mismatch + ((i == (ch - 'a')) ? 0 : 1);

                if (dfs(node.lists[i], s, index + 1, newMismatch)) {
                    return true;
                }
            }
        }

        return false;
    }

}
class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        Trie trie = new Trie();

        // Insert all dictionary words
        for (String word : dictionary) {
            trie.insert(word);
        }

        List<String> result = new ArrayList<>();

        // Check each query
        for (String query : queries) {
            if (trie.check(query)) {
                result.add(query);
            }
        }

        return result;
    }
}