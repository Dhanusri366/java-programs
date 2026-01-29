class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
         return head;
         ListNode temp = head.next;
         ListNode prev = head;
         while(temp!=null){
             
               while( temp!=null && prev.val== temp.val){
                temp= temp.next;
               }
               prev.next = temp;
              
              prev = temp;
              if(temp!=null)
              temp= temp.next;
         }
return head;
    }
}
