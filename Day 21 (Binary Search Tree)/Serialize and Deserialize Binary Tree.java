public class Codec {

    public String serialize(TreeNode root) {
        //edge case:
        if (root == null) return "";

        //doing lvl order traversal
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        StringBuilder b = new StringBuilder();
        TreeNode dummy = new TreeNode(-1001); // key idea

        while (!q.isEmpty()) {            
            TreeNode cur = q.poll();

            if (cur.equals(dummy)) {
                b.append("x,");
                continue; // skip iteration after meeting dummy node
            }
            
			b.append(cur.val);
            b.append(',');  
            
            if (cur.left != null) 
                q.offer(cur.left); 
            else 
                q.offer(dummy);
           
            if (cur.right != null)
                q.offer(cur.right); 
            else
                q.offer(dummy);  
        }
        
        return b.toString();
    }

	// basic idea: use array implemenation formulas to parse array of strings AND use queue to build the tree
    public TreeNode deserialize(String data) {
        //edge case:
        if (data.isBlank()) return null;

        // split 1,2,3,x,4,x, into array of strings
        // go over array, pull values using formula: for each i (parent index) get leftChild via i_l = 2 * i + 1, i_r = 2 * 2 + 2; skip if met "x"
        String[] arr = data.split(",");

        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        q.offer(root);

        int i = 0;
        while (!q.isEmpty()) {
            TreeNode parent = q.poll();
            int l_i = 2 * i + 1 < arr.length ? 2 * i + 1 : -1;
            int r_i = 2 * i + 2 < arr.length ? 2 * i + 2 : -1;

            if (l_i != -1) {
                String l = arr[l_i];

                if (!l.equals("x")) {
                    TreeNode left = new TreeNode(Integer.parseInt(l));
                    parent.left = left;
                    q.offer(left);
                }
            }

            if (r_i != -1) {
                String r = arr[r_i];

                if (!r.equals("x")) {
                    TreeNode right = new TreeNode(Integer.parseInt(r));
                    parent.right = right;
                    q.offer(right);
                }
            }
            i++;
        }

        return root;
    }
}