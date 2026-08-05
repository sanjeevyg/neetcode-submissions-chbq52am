class Solution {
    public int maxProfit(int[] prices) {    
        int maxProfit = 0;
        int lowestPrice = prices[0];

        for(int currentPrice : prices) {
            lowestPrice = Math.min(currentPrice, lowestPrice);
            int profit = currentPrice - lowestPrice;
            maxProfit = Math.max(profit, maxProfit);
        }


        return maxProfit;
    }
}
