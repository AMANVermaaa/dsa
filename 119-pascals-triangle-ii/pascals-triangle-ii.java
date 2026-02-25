class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        long prev = 1;
        res.add(1);
        for(int i=1;i<=rowIndex;i++){
            long next = prev * (rowIndex-i+1)/i;
            prev = next;
            res.add((int)prev);
        }
        return res;
    }
}