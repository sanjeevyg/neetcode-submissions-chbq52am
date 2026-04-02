class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_value = 0
        current = prices[0]
        ind = 1

        while ind < len(prices):
            if prices[ind] > current:
                diff = prices[ind] - current
                max_value = max(max_value, diff)
            else:
                current = prices[ind]
            ind += 1
        return max_value

            
                

        