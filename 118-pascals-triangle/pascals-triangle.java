class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        int n = numRows;
        for(int i=0;i<n;i++){
            List<Integer> list = new ArrayList<>();

            for(int j=0;j<=i;j++){
                if(i==j || j==0) list.add(1);
                else list.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));

            }
            res.add(list);
        }
        return res;
    }
}