class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False
            
        s_dict = {}
        t_dict = {}

        for ch in s:
            s_dict[ch] = s_dict.get(ch, 0) + 1

        for ch in t:
            t_dict[ch] = t_dict.get(ch, 0) + 1

        for k, v in s_dict.items():
            print(k, v)
            if k not in t_dict:
                return False 
            if t_dict[k] != v:
                return False 
        return True