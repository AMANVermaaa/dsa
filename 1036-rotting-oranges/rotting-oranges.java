class Solution {
    class pair{
        int first;
        int second;
        int time;
        pair(int first, int second, int time){
            this.first=first;
            this.second=second;
            this.time=time;
        }
    }
    public void bfs(int sr, int sc, int[][] vis, int[][] grid){
        
        

    }
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];    
        
        Queue<pair> q = new LinkedList<>();
        int cntFresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2) {

                    q.offer(new pair(i,j,0));
                    vis[i][j]=2;
                }
                else{
                    vis[i][j]=0;
                }

                if(grid[i][j]==1) cntFresh++;
            }
        }
    
        int time=0;
        int[] drow= {-1,0,1,0};
        int[] dcol= {0,-1,0,1};

        int count=0;

        while(!q.isEmpty()){
            int row= q.peek().first;
            int col= q.peek().second;
            int t= q.peek().time;
            time= Math.max(time,t);
            q.poll();

            
            for(int i=0;i<4;i++){
                int nrow=row+drow[i];
                int ncol=col+dcol[i];
                
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    
                    vis[nrow][ncol]=2;
                    q.offer(new pair(nrow, ncol, time+1));
                    count++;
                }
            }


        }
        if(count!=cntFresh) return -1;
        return time;
        

    }
}