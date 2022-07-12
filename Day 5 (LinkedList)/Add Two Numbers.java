class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        int carry = 0;
        int sum = 0;
        while(l1 != null || l2 != null)
        {
            sum = carry;
            sum += (l1 != null ? l1.val : 0);
            sum += (l2 != null ? l2.val : 0);
            
            carry = sum / 10;
            int current = sum % 10;
            
            ans.next = new ListNode(current);
            ans = ans.next;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if(carry > 0)
            ans.next = new ListNode(carry);
        return temp.next;
    }
}