class Solution 
{
    int max = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) 
    {
        DFS(root);
        
        return max;
    }
    
    private int DFS(TreeNode root)
    {
        if(root == null)    return 0;
        
        int left = Math.max(DFS(root.left), 0);
        int right = Math.max(DFS(root.right), 0);
        
        int cur = root.val + left + right;
        
        max = Math.max(cur, max);
        
        return root.val + Math.max(left, right);
    }
}