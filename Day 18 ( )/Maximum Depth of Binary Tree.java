class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int height=0;
        int temp=maxDepth(root.left);
        if(temp>height)
            height=temp;
        temp=maxDepth(root.right);
        if(temp>height)
            height=temp;
        height++;
        return height;
    }
}