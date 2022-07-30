class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
      if((p == null && q == null)){
          return true;
      }
        if((p == null || q == null)){
           return false;
      }
          if(q.val != p.val)
            return false;
      
        boolean leftNodes = isSameTree(p.left,q.left);
        boolean rightNodes = isSameTree(p.right,q.right);
         
        return (leftNodes && rightNodes);
    }
}