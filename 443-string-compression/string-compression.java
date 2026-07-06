class Solution {
    public int compress(char[] chars) {
        
        int n=chars.length;
        if(n==1) return 1;
        StringBuilder str = new StringBuilder();
        int i=0;
        int count=0;
        for(int j=0;j<n;j++){
            if(chars[j]!=chars[i]){
                str.append(chars[i]);
                if(count>1) str.append(count);
                count=0;
                i=j;
            }
            count++;
        }
        str.append(chars[i]);
        if(count>1) str.append(count);
        
        for(i=0;i<str.length();i++){
            chars[i]=str.charAt(i);
        }
        return str.length();
    }
}