class Solution:
    def isValid(self, s: str) -> bool:
        mapping = {')':'(', '}':'{', ']':'['}
        tracker = []

        for e in s:
            if e in mapping:
                if tracker and tracker[-1] == mapping[e]:
                    tracker.pop()
                else:
                    return False
            else:
                tracker.append(e)
        
        return not tracker
        