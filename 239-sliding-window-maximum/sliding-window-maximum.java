class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> d = new ArrayDeque<>();
        int n = nums.length, i=0;

        int[] maxWindow = new int[n-k+1];
        int j=0;

        //First k elements
        while(i<k) {
            //remove smaller values from dequeue
            while(!d.isEmpty() && nums[i] >= nums[d.getLast()]) d.removeLast();

            d.addLast(i);
            i++;
        }
        maxWindow[j++] = nums[d.getFirst()];

        //process remaining elements
        while (i<n) {
            //remove all out of window
            if(!d.isEmpty() && d.getFirst() <= i-k) d.removeFirst();

            //remove smaller values from dequeue
            while(!d.isEmpty() && nums[i] >= nums[d.getLast()]) d.removeLast();

            d.addLast(i);
            i++;

            maxWindow[j++] = nums[d.getFirst()];
        }
        return maxWindow;
    }
}