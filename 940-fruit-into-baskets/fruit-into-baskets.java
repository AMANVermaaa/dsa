class Solution {
    public int totalFruit(int[] nums) {
        int left = 0;
        int right = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        int maxi =0;
        while(right<nums.length){
            mp.put(nums[right],mp.getOrDefault(nums[right],0)+1); 
            if(mp.size()>2){
                mp.put(nums[left],mp.get(nums[left])-1);
                if(mp.get(nums[left])==0){
                    mp.remove(nums[left]);
                }
                left++;
            }
            maxi= Math.max(maxi, right-left+1);
            
            right++;
        }
        return maxi;

    }
}