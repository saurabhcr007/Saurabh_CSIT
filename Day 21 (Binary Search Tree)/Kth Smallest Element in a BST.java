class Solution {
    public int kthSmallest(TreeNode root, int k) {
        
        TreeNode curr = root;
        Stack<TreeNode> s = new Stack<>();
        int n = 0;
        
        while(curr!=null || s.size() > 0) {
            while(curr != null) {
                s.push(curr);
                curr = curr.left;
            }
            
            curr = s.pop();
            n=n+1;
            if(n==k) {
                return curr.val;
            }
            
            curr = curr.right;
            
        }
        return 0;
    }
}