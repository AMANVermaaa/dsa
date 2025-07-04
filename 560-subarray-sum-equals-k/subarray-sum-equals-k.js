/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function(nums, k) {
    let count = 0, sum = 0;
    let map = {0: 1};
    for (let num of nums) {
        sum += num;
        if (map[sum - k]) count += map[sum - k];
        map[sum] = (map[sum] || 0) + 1;
    }
    return count;
};