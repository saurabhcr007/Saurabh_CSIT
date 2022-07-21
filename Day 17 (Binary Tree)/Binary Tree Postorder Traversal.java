class Solution {
    List<Integer> ans = new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode a) {
         
        if(a == null)
            return ans;
         
            postorderTraversal(a.left);
            postorderTraversal(a.right);
            ans.add(a.val);
        
        return ans;
    }
}