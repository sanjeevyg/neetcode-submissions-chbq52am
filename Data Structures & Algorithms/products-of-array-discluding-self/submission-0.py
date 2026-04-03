class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        ans = []
        for i in range(len(nums)):
            product = 1 
            for j, n in enumerate(nums):
                # print('n', n)
                # print('(i, j)', (i, j))
                if j == i:
                    continue
                product *= n 
                # print('product', product)
            ans.append(product)
            
        # print(ans)
        return ans