class Solution {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] inDegree = new int[V];
        for(int i = 0;i<V;i++){
            for(int j:adj.get(i)){
                inDegree[j]+=1;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<V;i++){
            if(inDegree[i]==0) q.offer(i);
        }
        int cnt = 0;
        while(!q.isEmpty()){
            int u = q.poll();
            cnt+=1;
            for(int i:adj.get(u)){
                if(--inDegree[i]==0){
                    q.offer(i);
                }
            }
        }
        if(cnt!=V) return true;
        return false;
    }
}