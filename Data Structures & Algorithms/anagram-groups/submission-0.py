class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        output = []
        c = list(strs)
        while c:
            e = c.pop()
            arr = [e]
            for x in c[:]:
                if self.validAnagram(e, x):
                    arr.append(x)
                    c.remove(x)
            output.append(arr)
        return output

    def validAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False 
        count = 26 * [0]
        for ch in s:
            count[ord(ch) - ord('a')] += 1
        for ch in t:
            count[ord(ch) - ord('a')] -= 1
        for k in count:
            if k != 0:
                return False 
        return True 

        

