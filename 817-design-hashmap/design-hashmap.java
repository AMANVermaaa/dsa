class MyHashMap {
    private static final int SIZE = 1009; // Prime number for better distribution
    private Node[] buckets;

    // Node class for linked list
    private static class Node {
        int key, value;
        Node next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        buckets = new Node[SIZE];
        // Initialize dummy head for each bucket
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new Node(-1, -1); // Dummy node
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int idx = hash(key);
        Node prev = findPrev(buckets[idx], key);
        if (prev.next == null) {
            prev.next = new Node(key, value); // Insert new node
        } else {
            prev.next.value = value; // Update existing
        }
    }

    public int get(int key) {
        int idx = hash(key);
        Node prev = findPrev(buckets[idx], key);
        if (prev.next == null) return -1;
        return prev.next.value;
    }

    public void remove(int key) {
        int idx = hash(key);
        Node prev = findPrev(buckets[idx], key);
        if (prev.next != null) {
            prev.next = prev.next.next; // Remove node
        }
    }

    // Helper to find previous node of target key
    private Node findPrev(Node head, int key) {
        Node prev = head;
        while (prev.next != null && prev.next.key != key) {
            prev = prev.next;
        }
        return prev;
    }
}