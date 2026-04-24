class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
    
        tracker = set()
        longest = 0
        _str = ''
        for i in range(len(s)):
            if s[i] not in tracker:
                tracker.add(s[i])
                _str += s[i]
                longest = max(longest, len(tracker))
            else:
                _str = _str[(_str.index(s[i]) + 1):] + s[i]
                tracker.clear()
                tracker = set(_str)
        return longest

