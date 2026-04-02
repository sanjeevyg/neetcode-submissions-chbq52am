class Solution:
    from collections import defaultdict
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = defaultdict(list)

        for word in strs:
            count = 26 * [0]
            # print('word', word)
            for s in word:
                count[ord(s) - ord('a')] += 1
            ans[tuple(count)].append(word)
        
        return list(ans.values())