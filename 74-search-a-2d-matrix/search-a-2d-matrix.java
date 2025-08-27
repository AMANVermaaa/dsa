class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=0;
        int c=matrix[0].length-1;

        while(r<matrix.length && c>=0){
            int curr= matrix[r][c];
            if(curr==target) return true;
            else if(curr>target) c--;
            else r++;
        }
        return false;
    }
}