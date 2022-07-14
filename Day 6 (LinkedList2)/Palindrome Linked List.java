class Solution {
    public boolean isPalindrome(ListNode head) {
        //Find the middle Node
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //Reverse the list from mid to end
        ListNode prev=null;
        while(slow!=null){
            ListNode next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        //Check the values are matching or not
        while(prev!=null){
            if(prev.val!=head.val)
                return false;
            head=head.next;
            prev=prev.next;
        }
        return true;
    }
}