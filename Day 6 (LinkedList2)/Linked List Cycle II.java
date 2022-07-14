public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return head;
        }
        
        Set<ListNode> nodes=new HashSet<>();
        ListNode node=head;
        
        while(node!=null){
            if(nodes.contains(node)){
                return node;
            }
            nodes.add(node);
            node=node.next;
        }
        
        return null;
    }
}