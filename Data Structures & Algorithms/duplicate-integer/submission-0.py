class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        s = set()
        for e in nums:
            if e in s:
                return True 
            s.add(e)
        return False
            

        
         