/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let n = nums.length;
    let sum=0;
    for(let i=0;i<n;i++){
        sum=sum+nums[i];
    }
    return (((n)*(n+1))/2)-sum;
};