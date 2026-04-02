class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs) == 0:
            return ""
        ans = ""

        i = 0
        while i < len(strs[0]):
            last_letter = strs[0][i]
            for s in strs:
                if i >= len(s) or last_letter != s[i]:
                    return ans 
            ans = ans + last_letter
            i += 1

        return ans 






                
