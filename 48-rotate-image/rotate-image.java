class Solution {
    public void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            int first = 0;
            int end = matrix[0].length-1;

            while(first<end){
                int temp = matrix[i][first];
                matrix[i][first]=matrix[i][end];
                matrix[i][end]=temp;
                
                first++;
                end--;
            }
        }

    }
}