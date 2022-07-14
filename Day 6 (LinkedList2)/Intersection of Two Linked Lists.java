public class Solution {
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    int count1=1;
    ListNode curr=headA;
    while(curr.next!=null)
    {
        
        curr=curr.next;  
        count1++;
    }
    curr=headB;
    
    int count2=1;
    while(curr.next!=null)
    {
        curr=curr.next;
        count2++;
    }
    
    ListNode small=new ListNode(-1);
    if(count1>=count2)
    {
        curr=headA;
        small=headB;
    }
    else
    {       curr=headB;
            small=headA;
    }
    int diff=Math.abs(count1-count2);
    //finding the same level in longer list
    int start=1;
    while(start<=diff)
    {
        curr=curr.next;
        start++;
    }
    //iterating from same level
    while(curr!=null && small!=null)
    {
        if(curr==small)
            return curr;
        
        curr=curr.next;
        small=small.next;
        
    }
    return null;
    
    
}
}