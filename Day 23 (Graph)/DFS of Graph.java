ArrayList<Integer> a=new ArrayList<Integer>();
   public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       boolean vis[]=new boolean[V];
       DFSRec(adj,0,vis);
       return a;
       // Code here
   }
   public void DFSRec(ArrayList<ArrayList<Integer>> adj,int s,boolean vis[])
   {
       vis[s]=true;
       a.add(s);
       for(int u:adj.get(s))
       {
           if(vis[u]==false)
               DFSRec(adj,u,vis);
       }
   }