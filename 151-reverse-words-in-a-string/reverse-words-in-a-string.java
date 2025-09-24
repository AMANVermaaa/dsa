class Solution {
    public String reverseWords(String s) {
        String ans="";
        String temp="";
        for(char ch: s.toCharArray()){
            if(ch!=' ') temp+=ch;
            else if(temp!=""){
                if(ans=="") ans=temp;
                else ans=temp+' '+ans;
                temp="";
            }
        }

        if(temp!=""){
            if(ans=="") ans=temp;
            else ans=temp+' '+ans;
        }
        return ans;
    }
}