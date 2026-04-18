class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        max_ = 1
        nums_set = set(nums)

        for num in nums:
            len_ = 1
            x = num - 1
            if x not in nums_set:
                y = num + 1
                while y in nums_set:
                    len_ = len_ + 1
                    y = y + 1
            if len_ > max_:
                max_ = len_

        return max_