public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
       // Code here
       boolean[] visited=new boolean[V];
       for(int i=0;i<V;i++){ //'for loop' for discontinous graph,so that to visit all node in the graph
           if(!visited[i]){
               if(dfs(i,adj,visited,-1))
                   return true;
           }
       }
       return false;
   }
   public boolean dfs(int u,ArrayList<ArrayList<Integer>> adj,boolean[] visited,int parent){
       visited[u]=true;
       
       for(int j:adj.get(u)){
           if(!visited[j]){
               if(dfs(j,adj,visited,u)) //here parent is updated with 'u',i.e 'u' is the parent of 'j'.
                   return true;
           }
           else if(parent!=j){
               return true;
           }
       }
       return false;
   }