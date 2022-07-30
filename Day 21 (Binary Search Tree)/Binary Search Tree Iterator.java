class BSTIterator {
    
    private void visit(TreeNode root) {
        if (root.left != null) visit(root.left);
        values.add(root.val);
        if (root.right != null) visit(root.right);
    }

    private Queue<Integer> values = new LinkedList<>();
    private int size;
    
    public BSTIterator(TreeNode root) {
        if (root != null) visit(root);
        size = values.size();
    }
    
    public int next() {
        size--;
        return values.poll();
    }
    
    public boolean hasNext() {
        return size > 0;
    }
}