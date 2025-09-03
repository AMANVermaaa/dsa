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
    public int[] nextLargerNodes(ListNode head) {

        int n=0;
        ListNode dummy=head;
        while(dummy.next!=null){
            dummy=dummy.next;
            n++;
        }
       
        int[] arr=new int[n+1];
        ListNode curr=head;
        return helper(curr,arr,0,n);
    }
    public int[] helper(ListNode curr, int[] arr,int count,int n){
        ListNode temp=curr;
        if(count==n){
            arr[count]=0;
            return arr;
        }
        while(temp.next != null){
            if(curr.val<temp.next.val){
                arr[count]=temp.next.val;
                break;
            }
            temp=temp.next;
        }
        if(temp.next==null) arr[count]=0;

        return helper(curr.next,arr,count+1,n);
    }
}