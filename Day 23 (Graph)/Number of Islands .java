class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j, m, n);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid, int cr, int cc, int m, int n) {
        if (cr < 0 || cr == m || cc < 0 || cc == n || grid[cr][cc] == '0') {
            return;
        }
        grid[cr][cc] = '0';
        int[] r = {0, 1, 0, -1};
        int[] c = {1, 0, -1, 0};
        for (int i = 0; i < 4; i++) {
            dfs(grid, cr + r[i], cc + c[i], m, n);
        }
    }
}