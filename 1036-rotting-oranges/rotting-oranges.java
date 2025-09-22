class Solution {
    class triple{
        int first;
        int second;
        int time;
        public triple(int first, int second, int time){
            this.first = first;
            this.second = second;
            this.time = time;
        }
    }
    
    public int orangesRotting(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;

        int[][] vis = new int[m][n];
        
        int cntFresh=0;
        Queue<triple> q = new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new triple(i,j,0));
                    vis[i][j]=2;
                }
                else {
                    vis[i][j]=0;
                }

                if(grid[i][j]==1) cntFresh++;
            }
        }

        int time = 0;
        int count = 0;

        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,-1,0,1};
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            int t = q.peek().time;
            time = Math.max(t,time);

            q.poll();

            for(int i=0;i<4;i++){
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];

                if(nrow >= 0 && ncol >= 0 && nrow < m && ncol < n && grid[nrow][ncol]==1 && vis[nrow][ncol]==0){
                    vis[nrow][ncol]=2;
                    q.offer(new triple(nrow, ncol, time+1));
                    count++;
                }
                
            }

        }

        if(count == cntFresh) return time;
        return -1;
    }
}