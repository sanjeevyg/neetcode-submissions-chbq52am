class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        check = {}

        for index, num in enumerate(nums):
            com = target - num
            if com in check:
                return sorted([nums.index(com), index])
            check[num] = index
        