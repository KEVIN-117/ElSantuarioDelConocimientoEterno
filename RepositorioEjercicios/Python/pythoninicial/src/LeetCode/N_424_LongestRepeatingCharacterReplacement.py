class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        if k > len(s): return len(s)
        counter = [0] * 26
        max_len = k
        plus_occur = 0

sol = Solution()
print(sol.characterReplacement("ABAB", 2))