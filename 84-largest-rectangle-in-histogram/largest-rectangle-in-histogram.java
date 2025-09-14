class Solution {
    public int[] nextSmall(int[] h){
        Stack<Integer> st= new Stack<>();
        int[] help = new int[h.length];
        int i=0;
        int n=h.length;
        while(i<n){
            while(!st.isEmpty() && h[i]<h[st.peek()]){
                help[st.pop()]=i;
            }
            st.push(i);
            i++;
        }
        
        while(!st.isEmpty()){
            help[st.pop()]=n;
        }
        return help;
        
    }
    public int[] prevSmall(int[] h){
        Stack<Integer> st= new Stack<>();
        int[] help = new int[h.length];
        
        int n=h.length;
        int i=n-1;
        while(i>=0){
            while(!st.isEmpty() && h[i]<h[st.peek()]){
                help[st.pop()]=i;
            }
            st.push(i);
            i--;
        }
        
        while(!st.isEmpty()){
            help[st.pop()]=-1;
        }
        return help;
    }
    public int largestRectangleArea(int[] heights) {
        int[] nextSmallest= nextSmall(heights);
        int[] prevSmallest= prevSmall(heights);
        int maxArea=0;
        
        for(int i=0;i<heights.length;i++){
            int currArea=(nextSmallest[i]-prevSmallest[i]-1)*heights[i];
            maxArea=Math.max(maxArea,currArea);
        }
        return maxArea;
    }
}