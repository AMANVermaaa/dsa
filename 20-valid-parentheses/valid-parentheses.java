class Solution {

    public boolean pair(char opening, char closing){
        return opening=='(' && closing==')' || opening=='[' && closing==']' || opening=='{' && closing=='}' ;

    }
    public boolean isValid(String s) {
       

        Stack<Character> st= new Stack<>();
        
        for(char c: s.toCharArray()){
            if(!st.isEmpty() && pair(st.peek(),c)) st.pop();
            else st.push(c);
        }
        
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}