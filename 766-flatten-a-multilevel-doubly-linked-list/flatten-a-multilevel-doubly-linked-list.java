/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        flattenDFS(head);
        return head;
    }

    // Helper returns the tail after flattening
    public Node flattenDFS(Node node) {
        Node curr = node, last = null;
        while (curr != null) {
            Node next = curr.next;
            if (curr.child != null) {
                Node childTail = flattenDFS(curr.child);

               
                curr.next = curr.child;
                curr.child.prev = curr;

                
                if (next != null) {
                    childTail.next = next;
                    next.prev = childTail;
                }

                
                curr.child = null;
                last = childTail;
            } else {
                last = curr;
            }
            curr = next;
        }
        return last;
    }
}