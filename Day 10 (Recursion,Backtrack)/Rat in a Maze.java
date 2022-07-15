class Solution {
    static ArrayList<String> ans;
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ans = new ArrayList<>();
        if(m[0][0]==0 || m[n-1][n-1]==0)
        return ans;
        helper("", m, 0,0,n);
        return ans;
        
    }
    static void helper(String path, int [][] arr, int i, int j, int n){
        if(i>-1 && j> -1 && i<n && j<n && arr[i][j]==1){
            //base condititon
            if(i==n-1 && j==n-1){
                ans.add(path);
                return;
            }
            //marking current block as visited
            arr[i][j]=0;
            helper(path + "D", arr, i+1, j, n);
            helper(path + "L", arr, i, j-1, n);
            helper(path + "R", arr, i, j+1, n);
            helper(path + "U", arr, i-1, j, n);
            //bakctrack
            arr[i][j]=1;
        }
    }
}