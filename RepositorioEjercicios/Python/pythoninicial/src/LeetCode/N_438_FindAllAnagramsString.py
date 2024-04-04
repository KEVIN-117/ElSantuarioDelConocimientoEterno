import collections
from typing import List


class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        if len(s) < len(p):
            return []
        p_count = collections.Counter(p)
        s_count = collections.Counter(s[:len(p)])
        res = []
        if p_count == s_count:
            res.append(0)
        x = len(s) - len(p) + 1
        for i in range(1, len(s) - len(p) + 1):
            s_count[s[i - 1]] -= 1
            s_count[s[i + len(p) - 1]] += 1
            if p_count == s_count:
                res.append(i)
        return res


sol = Solution()
s = "cbaebabacd"
p = "abc"
print(sol.findAnagrams(s, p))

s = "abab"
p = "ab"
print(sol.findAnagrams(s, p))
