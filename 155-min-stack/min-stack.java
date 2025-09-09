class MinStack {
    Stack<Integer> st;
    Stack<Integer> minStack;
    
    public MinStack() {
        st=new Stack<>();
        minStack=new Stack<>();
    }
    
    public void push(int x) {
        if(st.isEmpty()){
            st.push(x);
            minStack.push(x);
        }
        else{        
            st.push(x);
            minStack.push(Math.min(x,minStack.peek()));
        }
    }
    
    public void pop() {
        if(!st.isEmpty()){
            st.pop();
            minStack.pop();
        }
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        return st.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */