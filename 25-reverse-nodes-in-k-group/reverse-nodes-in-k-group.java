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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode curr=head;
        int i=1;
        while(curr!=null && i<=k){
            curr=curr.next;
            i++;
        }
        if(i<=k){
            return head;
        }
        curr=head;
        ListNode prev=null;
        ListNode nxt=null;
        i=1;
        while(curr!=null && i<=k){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
            i++;
        }
        
        if(nxt!=null){
            head.next= reverseKGroup(nxt,k);
        }
        
        return prev;
    }
}