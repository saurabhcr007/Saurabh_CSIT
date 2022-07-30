static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
   {   int a[]=new int[V];
       int in[]=new int[V];
       for(int i=0;i<V;i++)
           for(int x:adj.get(i))
               in[x]++;
       Queue<Integer> q=new LinkedList<Integer>();
       for(int i=0;i<V;i++)
           if(in[i]==0)
               q.add(i);
       int c=0;
       while(!q.isEmpty())
       {
           int u=q.remove();
           a[c]=u;
           c++;
           for(int x:adj.get(u))
               if(--in[x]==0)
                   q.add(x);
       }
       return a;
       // add your code here
   }