class Solution {
   // Function to return Breadth First Traversal of given graph.
   public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

       return healper(0, adj, new HashSet<>()); 
       
   }
   
   public ArrayList<Integer> healper(int start, ArrayList<ArrayList<Integer>> adj, Set<Integer> visited) {
       Queue<Integer> queue = new LinkedList<>(); 
       ArrayList<Integer> list = new ArrayList<>(); 
       
       if (!visited.contains(start)) {
           queue.add(start); 
           visited.add(start);
           
           while (!queue.isEmpty()) {
             Integer current = queue.remove(); 
             list.add(current); 
              
             for (Integer neighbour :adj.get(current)) {
                 if (!visited.contains(neighbour)) {
                     queue.add(neighbour);
                     visited.add(neighbour);
                 }
             }
               
           }
       }
       
       return list; 
   }
}