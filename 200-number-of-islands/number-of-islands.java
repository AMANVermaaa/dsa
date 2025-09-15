class Solution {
    class pair{
        int first;
        int second;
        pair(int first, int second){
            this.first=first;
            this.second=second;
        }
    }
    public void bfs(int row, int col, int[][] vis, char[][] grid){
        vis[row][col]=1;
        Queue<pair> q = new LinkedList<>();
        q.offer(new pair(row,col));

        int n =grid.length;
        int m= grid[0].length;

        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        while(!q.isEmpty()){
            int ro= q.peek().first;
            int co= q.peek().second;
            q.remove();

            for(int i=0;i<4;i++){
                
                int nrow=ro+drow[i];
                int ncol=co+dcol[i];

                if(nrow>=0 && ncol>=0 && nrow<n && ncol<m 
                && vis[nrow][ncol]==0 && grid[nrow][ncol]=='1' ){
                    vis[nrow][ncol]=1;
                    q.offer(new pair(nrow,ncol));
                }
                
            }
        }
        
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] vis = new int[n][m];
        int count=0;
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){

                if(vis[row][col]==0 && grid[row][col]=='1'){
                    count++;
                    bfs(row, col, vis, grid);
                }
            }
        }
        return count;
    }
}