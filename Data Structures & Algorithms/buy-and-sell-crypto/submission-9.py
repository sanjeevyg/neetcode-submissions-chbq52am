class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit = 0
        
        b = 0
        s = 1

        while s <= len(prices) - 1 and b < s:
            buy = prices[b]
            sell = prices[s]

            # print((b, s))
            # print('buy, sell', (buy, sell))
            profit = sell - buy 
            max_profit = max(profit, max_profit)

            if prices[b] > prices[s]:
                b = s
            s += 1
        return max_profit



        

            
                

        