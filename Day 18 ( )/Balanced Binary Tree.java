class Solution {
    public boolean isBalanced(TreeNode root) {
        return !(helper(root)==-1);
    }
    
    public int helper(TreeNode root){
        if(root==null) return 0;
        
        int lr=helper(root.left);
        if(lr==-1) return -1;
        int rr=helper(root.right);
        if(rr==-1) return -1;
        
        if(Math.abs(lr-rr)>1) return -1;
        
        return Math.max(lr,rr)+1;
    }
}