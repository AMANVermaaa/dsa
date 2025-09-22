class Solution {
    class pair{
        int first;
        int second;
        pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }

    public void bfs(int row, int col, int[][] vis, int[][] grid, int[] area){

        int m = grid.length;
        int n = grid[0].length;
        vis[row][col]=1;
        Queue<pair> q = new LinkedList<>();
        q.offer(new pair(row, col));
        
        int[] drow= {-1,0,1,0};
        int[] dcol= {0,-1,0,1}; 
        int carea=1;
        while(!q.isEmpty()){
            int nrow= q.peek().first;
            int ncol= q.peek().second;

            q.remove();

            for(int i =0;i<4;i++){
                int ro = nrow +drow[i];
                int co = ncol +dcol[i];

                if(ro>=0 && co>=0 && ro<m && co<n && vis[ro][co]==0 && grid[ro][co]==1){  
                    vis[ro][co]=1;
                    carea++;
                    q.offer(new pair(ro,co));
                    
                }
            }


        }
        area[0]=Math.max(area[0],carea);

    }

    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] vis = new int[m][n];
        int[] area=new int[1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j] == 0 && grid[i][j]==1){
                    
                    bfs(i,j,vis,grid,area);
                }
            }
        }
        return area[0];
    }
}