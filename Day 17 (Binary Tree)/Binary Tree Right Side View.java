class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightSideNodes = new ArrayList<Integer>();
        Queue<TreeNode> qu = new LinkedList<>();
        
        if(root != null) qu.add(root);
        
        while(!qu.isEmpty()) {
            int size = qu.size();
            while(size-- > 0) {
                TreeNode temp = qu.poll();
                if(temp.left != null) qu.add(temp.left);
                if(temp.right != null) qu.add(temp.right);
                if(size == 0) rightSideNodes.add(temp.val);
            }
        }
        return rightSideNodes;
    }
}