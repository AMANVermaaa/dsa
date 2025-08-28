class Solution {
    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<>();
        binary(list, "", n, 1);
        return list;
    }
    public void binary (List<String> list, String str, int n, int last){
        if(str.length()==n){
            list.add(str);
            return;
        }
        if(last!=0)
            binary(list,str+"0",n,0);
        binary(list,str+"1",n,1);
    }
}