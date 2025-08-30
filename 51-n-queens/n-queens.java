class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        int row=0;
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nQueen(res,n,row,board);

        return res;
    }
    public void nQueen(List<List<String>> res,int n,int row,char[][] board){
        if(row==n){
            res.add(construct(board));
            return;
        }

        for(int col=0;col<n;col++){
            
            if(isSafe(row,col,n,board)){  
                board[row][col]='Q';
                nQueen(res, n, row+1,board);
                board[row][col]='.';
            }
        }
    }

    public List<String> construct(char[][] board){

        List<String> list = new ArrayList<>();
        for(char[] row:board){
            list.add(new String(row));

        }
        return list;
    }
    public boolean isSafe(int row, int col, int n, char[][] board) {
    
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }
        
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }
}