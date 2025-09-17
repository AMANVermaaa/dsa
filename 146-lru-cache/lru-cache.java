class LRUCache {
    class Node {
        int key;
        int val;
        Node next;
        Node prev;
        Node(int key, int val){
            this.key=key;
            this.val=val;
        }
    }
    
    int capacity;
    Map<Integer, Node> cacheMap;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        cacheMap= new HashMap<>();
        head=null;
        tail=null;
    }
    
    public void put(int key, int val) {
        if(cacheMap.containsKey(key)){
            Node newNode = cacheMap.get(key);
            newNode.val=val;
            moveToHead(newNode);
        }
        else{
            if(cacheMap.size()>=capacity){
                removeTail();
            }
            Node newNode = new Node(key, val);
            cacheMap.put(key,newNode);
            addToHead(newNode);
        }
    }

    public int get(int key) {
        if(!cacheMap.containsKey(key)) return -1;

        Node newNode= cacheMap.get(key);
        moveToHead(newNode);
        return newNode.val;
        
    }
    public void moveToHead(Node temp){
        if(temp==head) return;
        if(temp==tail) tail=tail.prev;
        //breakLinkage
        if(temp.prev!=null) temp.prev.next=temp.next;
        if(temp.next!=null) temp.next.prev=temp.prev;
        addToHead(temp);
    }
    public void addToHead(Node temp){
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
    }
    public void removeTail(){
        if(tail.prev!=null) tail.prev.next=null;
        else head=null;
        cacheMap.remove(tail.key);
        tail=tail.prev;
    }
    
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */