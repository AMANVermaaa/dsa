class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num: nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->mp.get(a)-mp.get(b));
        for(int i: mp.keySet()){
            q.offer(i);
            if(q.size()>k) q.poll();
        }

        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i]=q.poll();
        }
        return res;
    }
}