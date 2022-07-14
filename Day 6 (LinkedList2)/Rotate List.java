class Solution {
    
    // Helper function to calculate length() of linked list
    private static int length(ListNode head) {
        int length = 0;
        ListNode temp = head;
        
        while(temp != null) {
            length++;
            temp = temp.next;
        }
        
        return length;
    }
    
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null)
            return head;
        
        int listLength = length(head);
        k %= listLength;
        if(k == 0)  return head;
        
        
        ListNode temp = head;
        int i = listLength - k -1;
        while(i !=  0) {
            temp = temp.next;
            i--;
        }
        
        // temp points to the end of the new list
        ListNode newHead = temp.next;
        temp.next = null;     
        
        temp = newHead;
        while(temp.next != null) {
            temp = temp.next;
        }
        
        temp.next = head;
        head = newHead;
        
        return head;        
    }
    
}