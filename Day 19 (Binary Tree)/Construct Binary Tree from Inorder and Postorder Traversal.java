class Solution {
    
    private int idx;
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx = postorder.length-1;
        TreeNode root = build(inorder, postorder, 0,postorder.length-1);
        return root;
    }
    
    private TreeNode build(int[] inorder, int[] postorder, int start, int end) {
        if (start>end) return null;
        TreeNode node = new TreeNode(postorder[idx--]);
        if (start==end) return node;   
        int index = 0;
         for (int i=end; i>=0; i--) {
            if (inorder[i]==node.val){
                 index =  i;
                break;
            }
        }  
        node.right = build(inorder, postorder, index+1, end);
        node.left = build(inorder, postorder, start, index-1);
        return node;
    }
}