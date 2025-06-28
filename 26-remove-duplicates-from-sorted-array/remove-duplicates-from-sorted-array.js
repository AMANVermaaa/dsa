/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(a) {
    let i =0;
    let j =1;
    let k =1;
    let n =a.length;
    while (j<n){
        if(a[i]==a[j])
            j++;
        else{
            a[++i]=a[j++];
            k++;
        }
    }
    return k;
};