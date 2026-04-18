class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0
        longest = 1
        nums_set = set(nums)

        for num in nums_set:
            len_ = 1
            x = num - 1
            if x not in nums_set:
                y = num + 1
                while y in nums_set:
                    len_ = len_ + 1
                    y = y + 1
            longest = max(longest, len_)

        return longest