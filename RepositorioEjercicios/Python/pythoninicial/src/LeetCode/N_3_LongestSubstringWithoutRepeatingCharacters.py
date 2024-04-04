class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        p1 = 0
        positionChar = {}
        maxLen = 0
        for fin in range(len(s)):
            if s[fin] in positionChar and p1 <= positionChar[s[fin]]:
                p1 = positionChar[s[fin]] + 1
            positionChar[s[fin]] = fin
            maxLen = max(maxLen, fin - p1 +1)
        return maxLen

sol = Solution()

print(sol.lengthOfLongestSubstring("abcabcbb"))
print(range(len("abcabcbb")))
