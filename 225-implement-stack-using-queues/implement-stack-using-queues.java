class MyStack {
    Queue<Integer> Q1;
    Queue<Integer> Q2;

    public MyStack() {
        Q1 = new LinkedList<>();
        Q2 = new LinkedList<>();

    }
    
    public void push(int x) {
        Q2.offer(x);
        while(!Q1.isEmpty()){
            Q2.offer(Q1.peek());
            Q1.poll();
        }
        Queue<Integer> q = Q1;
        Q1=Q2;
        Q2=q;
    }
    
    public int pop() {
        if(Q1.isEmpty()) return -1;
        return Q1.poll();

    }
    
    public int top() {
        if(Q1.isEmpty()) return -1;
        return Q1.peek();
    }
    
    public boolean empty() {
        if(Q1.isEmpty()){
            return true;
        }
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