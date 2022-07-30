class Solution {
   // Function to return Breadth First Traversal of given graph.
   public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       // Code here
       Queue<Integer> queue= new ArrayDeque<>();
       queue.add(0);
       boolean[] visited=new boolean[V];
       visited[0]=true;
       ArrayList<Integer> list =new ArrayList<>();
       while(!queue.isEmpty())
       {
           int top=queue.poll();
           list.add(top);
           for(int i : adj.get(top))
           {
               if(visited[i]==false)
               {
                   queue.add(i);
                   visited[i]=true;
                   
               }
           }
       }
       return list;
   }
}