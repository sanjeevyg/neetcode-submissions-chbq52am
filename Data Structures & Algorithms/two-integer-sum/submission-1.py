class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        check = {}

        for i in range(len(nums)):
            com = target - nums[i]
            if com in check:
                return sorted([i, check[com]])
            check[nums[i]] = i
        return []

        