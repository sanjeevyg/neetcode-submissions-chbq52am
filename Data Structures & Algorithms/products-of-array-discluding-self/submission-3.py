class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        ans = [1] * n

        pre = 1
        for i in range(n):
            ans[i] = pre
            pre = pre * nums[i]

        print(ans)
        
        suff = 1
        for i in range(n - 1, -1, -1):
            ans[i] = suff * ans[i]
            suff = suff * nums[i]

        
        return ans 