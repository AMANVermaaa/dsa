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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode fast = head;
        ListNode slow = head;

        while((fast.next!=null) && (fast.next.next!=null)){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode prev=null, curr=slow.next;
        
        while(curr!=null){
            ListNode nxt = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }

        fast=head;
        slow=prev;

        while(slow!=null){
            if(fast.val!=slow.val) return false;
            fast=fast.next;
            slow=slow.next;

        }
        return true;
    }

}