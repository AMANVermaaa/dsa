/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function(nums) {
    let low =0, mid=0, high=nums.length-1;
    while(mid<=high){
        if(nums[mid]===0){
            [nums[mid++],nums[low++]]=[nums[low],nums[mid]];
        }
        else if(nums[mid]===1){
            mid++;
        }
        else{
            [nums[mid],nums[high--]]=[nums[high],nums[mid]];
        }
    }
};