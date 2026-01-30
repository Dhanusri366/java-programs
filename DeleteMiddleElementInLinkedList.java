class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null)
        return null;
        ListNode f = head;
        ListNode s  = head;
       ListNode prev = head;
        while(f!=null && f.next!=null){
            f = f.next.next;
            prev = s;
            s = s.next;
            
        }
        prev.next = s.next;
        return head;
    }
}
