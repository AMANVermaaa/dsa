/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    let num = [];
    let n = numRows;
    for(let i=0;i<n;i++){
        
        let nums=[];
        for(let j=0;j<i+1;j++){
            
            if(i===j || j===0) nums.push(1);
            else nums.push(num[i-1][j-1]+num[i-1][j]);
            
        }
        num.push(nums);
    }
    return num;
};