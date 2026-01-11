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
        if(head==null)
        return head;
        ListNode temp2 = head;
        int count =0;
        while(temp2!=null){
      count++;
      temp2 = temp2.next;
        }
        if(k>count){
            k = k%count;
        }
        for(int i=0;i<k;i++){
        ListNode temp= head;
        ListNode prev=temp;
        
        while(temp.next!=null){
             prev = temp;
            temp = temp.next;
        }
        temp.next = head;
        prev.next = null;
        head = temp;
        }
    return head;
    }
}
