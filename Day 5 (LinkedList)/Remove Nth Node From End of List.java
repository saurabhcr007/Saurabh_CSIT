class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        while (n > 0) {
            temp = temp.next;
            n--;
        }
        
        if (temp == null) {
            return head.next;
        } else {
            ListNode left = head, right = temp, prev = null;
            
            while (right != null) {
                prev = left;
                left = left.next;
                right = right.next;
            }
            
            prev.next = left.next;
        }
        return head;
    }
}