/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    let count=0;
    let max=0;
    for(let num of nums){
        if(num===1){
            count++;
            max = Math.max(count, max)
        }
        else{
            count=0;
        }
        
    }
    
    
    return max;
};