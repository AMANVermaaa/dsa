class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(list,0,0, n, "");
        return list;
    }
    public void generate(List<String> list,int open, int close, int n, String str){
        if(str.length()==(2*n)){
            list.add(str);
            return;
        }

        if(open < n) generate(list,open+1,close,n,str+"(");
        if(close < open) generate(list,open,close+1,n,str+")");

    }
}