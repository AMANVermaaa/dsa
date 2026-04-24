class Pair{
    int val;
    int day;
    Pair(int val, int day){
        this.val=val;
        this.day=day;
    }
}


class StockSpanner {
    Deque<Pair> stk;
    public StockSpanner() {
        stk = new ArrayDeque<>();
    }
    
    public int next(int price) {
        int stock = 1;
        while(!stk.isEmpty() && stk.peek().val<=price){
            Pair prc = stk.pop();
            stock+=prc.day;
        }
        stk.push(new Pair(price,stock));
        return stock;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */