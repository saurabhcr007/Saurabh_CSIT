class Solution {
    List<Integer> al=new ArrayList<>();
    Stack<TreeNode> st=new Stack<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null) return al;
        st.push(root);
        while(!st.isEmpty()){ //loop untill stack is empty
            TreeNode node = st.pop();
            al.add(node.val);
            if(node.right!=null){
                st.push(node.right);
            }
            if(node.left!=null){
                st.push(node.left);
            }
        }
        return al;
        
    }
}