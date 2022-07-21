class Solution
{
    
    static ArrayList<Integer> topView(Node root)
   {

       ArrayList<Integer> list = new ArrayList<>();
       if(root==null){
           return list;
       }
       
       Queue<pair> q = new LinkedList<>();
       Map<Integer,Integer> mp = new TreeMap<>();
       q.add(new pair(root,0));
       while(!q.isEmpty()){
           pair curr = q.poll();
           if(!mp.containsKey(curr.hd)){
               mp.put(curr.hd,curr.node.data);
           }
           
           if(curr.node.left!=null){
               q.add(new pair(curr.node.left,curr.hd-1));
           }
           if(curr.node.right!=null){
               q.add(new pair(curr.node.right,curr.hd+1));
           }
       }
       for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
           list.add(entry.getValue());
       }
       return list;
       
   }
   
  static public class pair{
       Node node;
       int hd;
       pair(Node node,int hd){
           this.node = node;
           this.hd=hd;
       }
   }
}