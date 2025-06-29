/**
 * @param {number[]} nums
 * @return {number[]}
 */
var rearrangeArray = function(nums) {
    let arr1=[];
    let arr2=[];

    for(let num of nums){
        if(num<0) arr1.push(num);
        else arr2.push(num);
    }
    let i=0;
    let j=0;
    while (i<arr1.length){
        if(j%2==0) nums[j++]=arr2[i];
        else nums[j++]=arr1[i++];
    }
    return nums;
};