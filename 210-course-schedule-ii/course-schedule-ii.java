class Solution {
    public int[] findOrder(int V, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Integer>());
        }

        
        for(int[] p: prerequisites){
            adj.get(p[1]).add(p[0]);
        }
        

        int[] indegree= new int[V];
        for(int i=0;i<V;i++){
            for(int it: adj.get(i)){
                indegree[it]++;
            }
        }
        

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0) q.offer(i);
        }

        
        int[] res = new int[V];
        
        int cnt=0;
        int i=0;
        while(!q.isEmpty()){
            int node = q.poll();
            res[i++]=node;
            cnt++;

            for(int it: adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0) q.offer(it);
            }
        }

        if(cnt==V) return res;
        return new int[0];
    }
}
