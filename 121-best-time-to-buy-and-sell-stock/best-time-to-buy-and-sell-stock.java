class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxi = 0;
        for(int price:prices){
            if(price<buy) buy= price;
            else maxi = Math.max(maxi, price-buy);
        }
        return maxi;
    }
}