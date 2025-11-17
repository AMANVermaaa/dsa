class Solution {
    
    public int numIslands(char[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;

        int[][] vis = new int[m][n];

        int count = 0;
         
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == '1' && vis[i][j] == 0){
                    count++;
                    
                    dfs(i, j, grid, vis);
                    
                }
            }
        }

        return count;

    }

    int[] row = {0,-1,0,1};
    int[] col = {-1,0,1,0};

    public void dfs(int i, int j, char[][] grid, int[][] vis){
        vis[i][j] = 1;
        
        for(int k=0;k<4;k++){
            int nrow = i+row[k];
            int ncol = j+col[k];

            if(nrow>=0 && ncol>=0 && nrow<grid.length && ncol<grid[0].length && grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0){
                    dfs(nrow, ncol, grid, vis);
            }
        }
    }
}