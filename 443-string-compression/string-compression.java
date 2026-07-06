class Solution {
    public int compress(char[] chars) {
        int i = 0, j = 0;
        int n = chars.length;
        
        while (j < n) {
            char current = chars[j];
            int count = 0;

            while (j < n && chars[j] == current) {
                j++;
                count++;
            }
            
            chars[i++] = current;
            
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[i++] = c;
                }
            }
            
        }
        return i;
    }
}