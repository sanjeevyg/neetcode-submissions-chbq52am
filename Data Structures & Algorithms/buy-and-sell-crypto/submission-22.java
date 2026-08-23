class Solution {
    public int maxProfit(int[] prices) {    
        int left = 0;
        int maxProfit = 0;

        for(int right = 1; right < prices.length; right++) {
                int buy = prices[left];
                int sell = prices[right];
                int profit = sell - buy;
                maxProfit = Math.max(profit, maxProfit);
                if(prices[left] > prices[right]) {
                    left = right;
                }
        }
        return maxProfit;
    }   
}
