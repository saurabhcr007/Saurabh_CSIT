class Solution {
    HashMap<Node,Node> map;
    public Node copyRandomList(Node head) {
        map = new HashMap();
        Node head1 = head;
        while(head1 != null){
            map.put(head1, new Node(head1.val));
            head1 = head1.next;
        }
        Node head2 = head;
        while(head2 != null){
            if(head2.next != null){
                map.get(head2).next = map.get(head2.next);
            }
            else{
                map.get(head2).next = null;
            }
            if(head2.random != null){
                map.get(head2).random = map.get(head2.random);
            }
            else{
                map.get(head2).random = null;
            }
            head2 = head2.next;
        }
        return map.get(head);
    }
}