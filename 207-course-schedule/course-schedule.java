class Solution {
    public boolean canFinish(int V, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Integer>());
        }

        for(int i=0;i<V;i++){
            for(int[] p: prerequisites){
                adj.get(p[1]).add(p[0]);
            }
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


        
        int cnt=0;
        while(!q.isEmpty()){
            int node = q.poll();
            
            cnt++;

            for(int it: adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0) q.offer(it);
            }
        }

        if(cnt==V) return true;
        return false;
    }
}