/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let cSum=nums[0];
    let mSum=nums[0];

    for (let i=1;i<nums.length;i++){
        cSum=Math.max(nums[i],cSum+nums[i]);
        mSum=Math.max(mSum,cSum);
    }

    return mSum;
};