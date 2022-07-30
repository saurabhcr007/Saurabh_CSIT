class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root.left==null && root.right==null){
            return true;
        }else if(root.left==null){
            return false;
        }else if(root.right==null){
            return false;
        }
        
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        
        q1.add(root.left);
        q2.add(root.right);
        
        while(!q1.isEmpty() || !q2.isEmpty()){
            TreeNode n1 = q1.remove();
            TreeNode n2 = q2.remove();
            
            if(n1 != null && n2 !=null){
               if(n1.val != n2.val){
                return false;
            }
                q1.add(n1.left);
                q1.add(n1.right);
                
                 q2.add(n2.right);
                q2.add(n2.left);
               
            }else if(n1==null && n2!=null){
                return false;
            }else if(n2==null && n1!=null){
                return false;
            }
        }
        
        return true;
    }
}