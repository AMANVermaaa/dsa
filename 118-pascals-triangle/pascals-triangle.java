class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        int n = numRows;
        for(int i=0;i<n;i++){
            List<Integer> list = new ArrayList<>();
            long val=1;
            for(int k=0;k<=i;k++){
                list.add((int)val);
                val=val*(i-k)/(k+1);

            }
            res.add(list);
        }
        return res;
    }
}