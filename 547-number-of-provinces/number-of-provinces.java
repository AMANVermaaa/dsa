class Solution {
    public void dfs(int node, int[][] isConnected, int[] vis){
        vis[node]=1;
        int n=isConnected.length;

        for(int i=0;i<isConnected.length;i++){
            if(vis[i]==0 && isConnected[node][i]==1){
                dfs(i, isConnected, vis);
            }
        }
        
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        

        int count=0;
        int[] vis = new int[n];

        for(int i=0;i<n;i++){
            

            if(vis[i]==0){
                count++;
                dfs(i, isConnected, vis);
            }
            
        }
        return count;
    }

}