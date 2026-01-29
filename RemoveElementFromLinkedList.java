class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
        return head;
    while(head!=null && head.val == val)
    head = head.next;
    if(head!=null){
     ListNode   temp = head.next;
     ListNode prev = head;
     while(temp!=null){
        while(temp!=null &&temp.val == val){
        temp = temp.next;
       
        }
        prev.next = temp;
        prev = temp;
        if(temp!= null)
        temp = temp.next;
     }
    }
