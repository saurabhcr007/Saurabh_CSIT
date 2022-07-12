class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode current = head;
        ListNode prev = null;
        ListNode next = head.next;
        
        while(current!=null ){
            current.next = prev;
            if(next==null) return current;
            prev = current;
            current = next;
            next = next.next;
        }
        return current;
    }
}