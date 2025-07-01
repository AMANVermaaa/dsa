/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function(arr) {
    let n = arr.length;
    if (n === 0)
        return 0;

    let longest = 1;
    let st = new Set();
    
    for (let i = 0; i < n; i++) {
        st.add(arr[i]);
    }

    for (let it of st) {
        
        if (!st.has(it - 1)) {
            
            let cnt = 1;
            let x = it;
            while (st.has(x + 1)) {
                x = x + 1;
                cnt = cnt + 1;
            }
            longest = Math.max(longest, cnt);
        }
    }
    return longest;
};