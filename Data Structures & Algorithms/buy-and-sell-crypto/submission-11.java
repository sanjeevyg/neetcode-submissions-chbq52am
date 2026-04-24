class Solution {
    public int maxProfit(int[] prices) {    
        int max_profit = 0;
        int minPrice = prices[0];

        for(int price : prices) {
            int profit = price - minPrice;
            max_profit = Math.max(profit, max_profit);

            if (minPrice > price) minPrice = price;
        }
        return max_profit;
        
    }
}
