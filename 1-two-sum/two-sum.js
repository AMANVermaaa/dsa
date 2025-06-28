/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const map = {};
    for (let i=0;i<nums.length;i++){
        const compliment=target-nums[i];
        if(map.hasOwnProperty(compliment)){
            return [map[compliment],i];
        }
        map[nums[i]]=i;
    }
};