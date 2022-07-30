
ustaalon
2 weeks ago


class Solution
{
   // return the Kth largest element in the given BST rooted at 'root'
   public int kthLargest(Node root,int K)
   {
       TreeInfo treeInfo = new TreeInfo(0, -1);
       traverseTree(root, K, treeInfo);
       
       return treeInfo.latestVisitedNodeValue;
   }
   
   public void traverseTree(Node node, int k, TreeInfo treeInfo) {
       if(node == null || treeInfo.numberOfNodesVisited >= k) return;
       
       traverseTree(node.right, k, treeInfo);
       if(treeInfo.numberOfNodesVisited < k) {
           treeInfo.numberOfNodesVisited += 1;
           treeInfo.latestVisitedNodeValue = node.data;
           traverseTree(node.left, k, treeInfo);    
       }
   }
   
   public static class TreeInfo {
       public int numberOfNodesVisited;
       public int latestVisitedNodeValue;
       
       public TreeInfo(int numberOfNodesVisited, int latestVisitedNodeValue) {
           this.numberOfNodesVisited = numberOfNodesVisited;
           this.latestVisitedNodeValue = latestVisitedNodeValue;
       }
   }
}