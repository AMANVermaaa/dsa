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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode c1=l1;
        ListNode c2=l2;
        int carry=0;
        ListNode dummy = new ListNode(-1,null);
        ListNode curr=dummy;
        while(c1!=null && c2!=null){
            int temp=c1.val+c2.val+carry;
            
            if(temp<10){
                ListNode newNode=new ListNode(temp,null);
                carry=0;
                curr.next=newNode;
            }
            else{
                ListNode newNode=new ListNode((temp%10),null);
                carry=1;
                curr.next=newNode;
                
            }
            
            curr=curr.next;
            c1=c1.next;
            c2=c2.next;
        }
        
        while(c1!=null){
            if(carry==1){
                int temp=c1.val+carry;
                if(temp<10){
                    ListNode newNode=new ListNode(temp,null);
                    carry=0;
                    curr.next=newNode;
                }
                else{
                    ListNode newNode=new ListNode((temp%10),null);
                    carry=1;
                    curr.next=newNode;
                    
                }
                curr=curr.next;
            }
            else{
                curr.next=c1;
                break;
            }
            
            c1=c1.next;

        }
        
        
        while(c2!=null){
            if(carry==1){
                int temp=c2.val+carry;
                if(temp<10){
                    ListNode newNode=new ListNode(temp,null);
                    carry=0;
                    curr.next=newNode;
                }
                else{
                    ListNode newNode=new ListNode((temp%10),null);
                    carry=1;
                    curr.next=newNode;
                    
                }
                curr=curr.next;
            }
            else{
                curr.next=c2;
                break;
            }
            
            c2=c2.next;
        }

        if(carry==1){
            ListNode newNode = new ListNode(1,null);
            curr.next=newNode;
        }
        
        return dummy.next;
    }
}