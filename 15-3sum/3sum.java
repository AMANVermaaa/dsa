class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length-1;

        for(int i=0;i<=n-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left = i+1;
            int right = n;
            while(left<right){
                
                List<Integer> arr = new ArrayList<>();
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    arr.add(nums[i]);
                    arr.add(nums[left]);
                    arr.add(nums[right]);
                    list.add(arr);
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1])
                        left++;
                    while(left<right && nums[right]==nums[right+1])
                        right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }   
            }
        }
        return list;

    }
}