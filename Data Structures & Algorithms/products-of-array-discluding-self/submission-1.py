class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefix = []
        suffix = []

        ans = []

        pre = 1
        for i in range(len(nums)):
            if i == 0:
                prefix.append(1)
            else:
                pre *= nums[i - 1]
                prefix.append(pre) 

        suf = 1
        print('suf', suf)
        for i in range(len(nums) -1 , -1, -1):
            if i == len(nums) - 1 :
                suffix.append(1)
            else:
                print('suf', nums[i + 1])
                suf *= nums[i + 1]
                suffix.append(suf)
        print('suffix', suffix)
        print('prefix', prefix)
        

        for i in range(len(nums)):
            ans.append(prefix[i] * suffix[len(nums) - 1 - i])

        return ans


