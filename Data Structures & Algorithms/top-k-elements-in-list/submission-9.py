class Solution:
    from collections import defaultdict
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = defaultdict(int)
        for num in nums: 
            count[num] += 1
        
        # print('count', count
        ans = []
        print(count)
        for key, value in sorted(count.items(), key=lambda x: x[1], reverse=True):
            ans.append(key)
        print(ans)
        return ans[:k]