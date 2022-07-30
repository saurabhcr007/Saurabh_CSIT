class Solution {
    List<List<Integer>> li=new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        zig(root,0,li);
        return li;
    }
        
    void zig(TreeNode node,int level,List<List<Integer>> l){
        if(node!=null)
        {
            if(li.size()<=level)
                li.add(new ArrayList<>());
            if(level%2==0)
                li.get(level).add(node.val);
            else
                li.get(level).add(0,node.val);
            zig(node.left,level+1,l);
            zig(node.right,level+1,l);      
        }
    }
}