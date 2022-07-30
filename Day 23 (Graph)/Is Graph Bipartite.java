class Solution {
    private int[][] graph;
    private int n = 0;
    
    public boolean isBipartite(int[][] graph) {
        this.n = graph.length;
        this.graph = graph;
        int[] color = new int[n];
        for(int i=0;i<n;i++) 
            color[i]=0; // 0->No color, 1->Red, 2->Blue

        boolean isBp = true;
        for(int i=0;i<n;i++) {
            if(color[i] == 0) {
                if(dfs(i, color, 1))
                    continue;
                else {
                    isBp = false;
                    break;
                }
            }
        }
        return isBp;
    }
    
    public boolean dfs(int ch, int[] color, int parColor) {
        if(color[ch] != 0 && color[ch]!=parColor) return true;
        if(color[ch] != 0 && color[ch]==parColor) return false;
        color[ch] = parColor == 1? 2:1;
        
        for(int cch : graph[ch])
            if(!dfs(cch, color, color[ch])) return false;
        return true;
    }
}