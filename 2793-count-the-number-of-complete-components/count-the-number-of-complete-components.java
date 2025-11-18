class Solution {
    public void dfs(int i, int[] vertices, int[] edge, ArrayList<ArrayList<Integer>> list, int[] vis){
        vis[i]=1;
        vertices[0]++;
        edge[0]+=list.get(i).size();
        for(int neighbor: list.get(i)){
            if(vis[neighbor] == 0){
                dfs(neighbor, vertices, edge, list, vis);
            }
        }
    }

    public int countCompleteComponents(int n, int[][] edges) {
        int[] vis = new int[n];
        int ans=0;

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(new ArrayList<Integer>());
        }

        for(int i=0;i<edges.length;i++){
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
        }

        for(int i=0;i<n;i++){
            int[] vertices ={0};
            int[] edge ={0};
            if(vis[i] == 0){
                dfs(i,vertices,edge,list,vis);
                edge[0]/=2;
                if(edge[0] == vertices[0]*(vertices[0]-1)/2){
                    ans++;
                }

            }
        }
        return ans;

    }
}