class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy, curr = head, next = null;
        int len = length(head);
        
        while(len>=k){
            ListNode start = curr, prevStart = prev;
            for(int i=0;i<k;i++){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            start.next = curr;
            prevStart.next = prev;
            prev = start;
            len -= k;
            // print(dummy.next);
        }
        return dummy.next;
    }
    static int length(ListNode head){
        int c = 0;
        while(head!=null && head.next!=null){
            head = head.next.next;
            c += 2;
        }
        return head==null ? c : c+1;
    }
    static void print(ListNode head){
        while(head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }
        System.out.println();
    }
}