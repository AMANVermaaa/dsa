class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] pair = new int[2];

        for(int i=0;i<nums.length;i++){
            int compliment = target - nums[i];
            if(mp.containsKey(compliment)){
                pair[0]=mp.get(compliment);
                pair[1]=i;
            }
            mp.put(nums[i],i);
        }
        return pair;
    }

}