/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let minimumPrice= Number.MAX_VALUE;
    let maximumProfit= 0;
    for (let price of prices){
        if(price< minimumPrice) minimumPrice=price;
        else if((price-minimumPrice)>maximumProfit) maximumProfit=price-minimumPrice;
    }
    return maximumProfit;
};
