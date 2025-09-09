class MyStack {
    Queue<Integer> Q;
    
    public MyStack() {
        Q = new LinkedList<>();
    }
    
    public void push(int x) {
        Q.offer(x);
        int i=0;
        while(i<Q.size()-1){
            Q.offer(Q.poll());
            i++;
        }
    }
    
    public int pop() {
        if(Q.isEmpty()) return -1;
        return Q.poll();
    }
    
    public int top() {
        if(Q.isEmpty()) return -1;
        return Q.peek();
    }
    
    public boolean empty() {
        if(Q.isEmpty()) return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */