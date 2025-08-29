class Solution {
    int[] rowMoves = {2,2,-2,-2,-1,-1,1,1};
    int[] colMoves = {1,-1,1,-1,2,-2,2,-2};

    public boolean checkValidGrid(int[][] grid) {
        
        int n=grid.length;
        if(grid[0][0]!=0) return false;
        return traverse(0,0,n,grid,1);

    }
    public boolean isSafe(int x, int y, int n, int[][] matrix, int move) {
        if(x>=0 && y>=0 && x<n && y<n && //In-boudary
                matrix[x][y] == move ) {  //no visited
            return true;
        }
        return false;
    }
    private boolean traverse(int x, int y, int n, int[][] grid, int move){
        int nextX, nextY;

        if(move == n*n){
            return true;
        }
        

        for(int i=0;i<8;i++) {
            nextX = x + rowMoves[i];
            nextY = y + colMoves[i];

            if(isSafe(nextX, nextY, n, grid, move)) {
                
                if(traverse(nextX, nextY, n, grid, move+1))
                    return true;
                else return false;
            }
        }
        return false;
    }
}