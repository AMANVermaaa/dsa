class Solution {
    class triplet{
        int x;
        int y;
        int t;
        triplet(int x, int y, int t){
            this.x = x;
            this.y = y;
            this.t = t;
        }
    }
    public int orangesRotting(int[][] grid) {

        Queue<triplet> q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2){
                    q.offer(new triplet(i, j, 0));
                }
            }
        }

        int row[] = {-1,0,1,0};
        int col[] = {0,-1,0,1};

        int maxi = 0;

        while(!q.isEmpty()){
            triplet node = q.poll();

            for(int i = 0;i < 4; i++){
                int r = node.x + row[i];
                int c = node.y + col[i];
                int t = node.t;
                if(r >= 0 && r < m && c >= 0 && c < n && grid[r][c] == 1){
                    q.offer(new triplet(r, c, t+1));
                    grid[r][c] = 2;
                }
                maxi = Math.max(maxi, t);
            }
            

        }

        for(int i = 0;i < m; i++){
            for(int j = 0;j < n; j++){
                if(grid[i][j] == 1) return -1;
            }
        }

        return maxi;
    }
}