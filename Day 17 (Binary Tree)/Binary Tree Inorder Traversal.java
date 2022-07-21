class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root,list);
        return list;
    }
    public static List<Integer> helper(TreeNode root, List<Integer> list){
        if(root==null)
            return list;
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
        return list;
    }
}