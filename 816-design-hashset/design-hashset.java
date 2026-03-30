class Bucket{
    private List<Integer> container;

    Bucket(){
        this.container= new LinkedList<Integer>();
    }

    public void insert(int val){
        int index = this.container.indexOf(val);
        if(index==-1) this.container.add(val);
    }

    public void remove(int val){
        this.container.remove(Integer.valueOf(val));
    }

    public boolean contains(int val){
        int index = this.container.indexOf(val);
        return index!=-1;
    }
}

class MyHashSet {
    private int numBuckets =769;
    Bucket[] buckets;
    public MyHashSet() {
        this.buckets= new Bucket[this.numBuckets];
        for(int i=0;i<numBuckets;i++){
            this.buckets[i]=new Bucket();
        }
    }
    public int hashFunction(int key){
        return key%numBuckets;
    }
    public void add(int key) {
        int bucketIndex = hashFunction(key);
        this.buckets[bucketIndex].insert(key);

    }
    
    public void remove(int key) {
        int bucketIndex = hashFunction(key);
        this.buckets[bucketIndex].remove(key);
    }
    
    public boolean contains(int key) {
        int bucketIndex = hashFunction(key);
        return this.buckets[bucketIndex].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */