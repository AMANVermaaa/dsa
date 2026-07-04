class Solution {
    public boolean vowel(char[] str, int ind){
        if(str[ind]=='a' || str[ind]=='e' || str[ind]=='i' || str[ind]=='o' || str[ind]=='u' || str[ind]=='A' || str[ind]=='E' || str[ind]=='I' || str[ind]=='O' || str[ind]=='U')
            return true;

        return false;
    }
    public String reverseVowels(String s) {
        int left =0;
        int right =s.length()-1;
        char[] str= s.toCharArray();

        while(left<right){
            if(vowel(str,left) && vowel(str,right)){
                char temp = str[left];
                str[left++] = str[right];
                str[right--] = temp;
            }
            else{
                while(left<right && !vowel(str,left)) left++;
                while(left<right && !vowel(str,right)) right--;
            }
        }

        return new String(str);
    }
}