class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minPrice= Integer.MAX_VALUE;

        for(int price: prices){
            int temp=price-minPrice;
            if(price < minPrice) minPrice=price;
            else maxProfit= Math.max(temp,maxProfit); 
        }
        return maxProfit;
    }
}