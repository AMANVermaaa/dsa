class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n= nums.length;
        List<List<Integer>> arr= new ArrayList<>();

        for(int i=0;i<Math.pow(2,n);i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0) list.add(nums[j]);
            }
            arr.add(list);

        }
        return arr;
    }
}