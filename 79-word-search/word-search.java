class Solution {
    int n;
    int m;
    int[] delrow={0,-1,0,1};
    int[] delcol={-1,0,1,0};

    public boolean find(int i, int j, char[][] board, String word, int idx){
        if(idx == word.length()) return true;
        if(i < 0 || j < 0 || i >= n || j >= m || board[i][j] == '$' 
        || board[i][j] != word.charAt(idx)) return false;

        

        char temp = board[i][j];
        board[i][j] = '$';

        for(int k = 0; k < 4; k++){
            int row = i + delrow[k];
            int col = j + delcol[k];

            if(find(row, col, board, word, idx+1)) return true;
            
        }

        board[i][j] = temp;

        return false;

    }
    public boolean exist(char[][] board, String word) {
        n = board.length;
        m = board[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0;j < m; j++){
                if(board[i][j] == word.charAt(0) && find(i ,j, board, word, 0))
                    return true;
            }
        }

        return false;

        
    }
}