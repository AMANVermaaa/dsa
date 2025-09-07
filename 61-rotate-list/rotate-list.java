/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null ) return head; 
        ListNode curr = head;
        int n=1;
        while(curr.next!=null){  
            n++;
            curr=curr.next;
        }
        
        k=k%n;
        if(k==0) return head;
        int i=0;
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null && i<(n-k)){
            prev=cur;
            cur=cur.next;
            i++;
        }
        curr.next=head;
        prev.next=null;
        
        return cur;
    }

    
}