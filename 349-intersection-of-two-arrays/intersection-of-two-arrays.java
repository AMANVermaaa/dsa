class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums1) set.add(num);
        Set<Integer> res = new HashSet<>();

        for(int num:nums2){
            if(set.contains(num)) res.add(num);
        }
        int i=0;
        int[] result = new int[res.size()];
        for(int num:res) result[i++]=num;
        return result;
    }
}