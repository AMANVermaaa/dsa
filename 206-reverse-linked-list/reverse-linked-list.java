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
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode prev=null;
//         ListNode curr=head;
//         ListNode next=head;
//         while(curr!=null){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         return prev;
//     }
// }
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode ans = reverseList(head.next); // ans = new head of reversed sublist
        head.next.next = head;  // connect tail of reversed sublist back to head
        head.next = null;       // break old forward link
        return ans;             // ans is the head of the reversed list
    }
}