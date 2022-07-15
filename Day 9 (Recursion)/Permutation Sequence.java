class Solution {
    int[] fact;
    public String getPermutation(int n, int k) {
        fact = new int[n+1];
        for(int i=0; i<=n; i++) fact[i] = factorial(i);
        return solve(n, k, "", 1, new boolean[n+1]);
    }
    
    public String solve(int n, int k, String curr, int i, boolean[] used){
        if(i>n) return curr;
        
        int count=fact[n-i];
        int j=1;
        for(; j<=n; j++){
            if(used[j]) continue;
            if(k<=count) break;
            count += fact[n-i];
        }
        
        used[j] = true;
        return solve(n, k-(count-fact[n-i]), curr+j, i+1, used);
    }
    
    public int factorial(int n){
        if(n==0 || n==1) return 1;
        return n*factorial(n-1);
    }
}