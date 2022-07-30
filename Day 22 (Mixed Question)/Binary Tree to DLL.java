class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
        if(root == null){
            return root;
        }
        Pair p = bToDLLUtil(root);
        return p.head;
    }
    Pair bToDLLUtil(Node root){
       
        if(root == null){
            return null;
        }
        Pair l = bToDLLUtil(root.left);
        Pair r = bToDLLUtil(root.right);
        if(l != null){
            root.left = l.tail;
        }
        if(l != null && l.tail != null){
            l.tail.right = root;
        }
        if(r != null){
            root.right = r.head;
        }
        if(r != null && r.head != null){
            r.head.left = root;
        }            
        return new Pair(l==null?root:l.head,r==null?root:r.tail);
        
    }
    
}
class Pair{
    Node head;
    Node tail;
    Pair(){
        this.head = null;
        this.tail = null;
    }
    Pair(Node head,Node tail){
        this.head = head;
        this.tail = tail;
    }
}