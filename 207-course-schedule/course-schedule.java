class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourses];
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        for(int i=0;i<numCourses;i++){
            for(int neighbor: adj.get(i)){
                indegree[neighbor]++;
            }
        }

        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0) q.offer(i);
        }
        int visited=0;

        while(!q.isEmpty()){
            int node = q.poll();
            visited++;

            for(int neighbor: adj.get(node)){
                indegree[neighbor]--;
                if(indegree[neighbor]==0) q.offer(neighbor);
            }
        }

        if(visited == numCourses) return true;
        return false;
    }
}