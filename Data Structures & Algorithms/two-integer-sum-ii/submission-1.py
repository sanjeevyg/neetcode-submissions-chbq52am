class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        for num in numbers:
            com = target - num 
            if num != com and com in numbers:
                return [numbers.index(num) + 1, numbers.index(com) + 1]
        