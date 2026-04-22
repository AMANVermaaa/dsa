class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = k-1;
        
        for(int i=0;i<=right;i++){
            list.add(arr[i]);
        }

        for(;right<arr.length-1;right++){

            int l=Math.abs(arr[left]-x);
            int r=Math.abs(arr[right+1]-x);

            if(l > r){
                list.remove(0);
                left++;
                list.add(arr[right+1]);
            }
        }

        return list;


    }
}