class Solution{
    
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        // Write your code here
        if(root==null)return 1;
        if(isBst(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
        {
            return Bst_size(root);
        }
        return Math.max(largestBst(root.left),largestBst(root.right));
    }
   static int Bst_size(Node root)
    {
      if(root==null)return 0;
      return 1+Bst_size(root.left)+Bst_size(root.right);
    }
   static boolean isBst(Node root,int low,int high)
    {
        if(root==null)return true;
        if(low>=root.data||root.data>=high)return false;
        return isBst(root.left,low,root.data)&&isBst(root.right,root.data,high);
    }
}