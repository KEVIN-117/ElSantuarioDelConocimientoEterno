package N_30_AdvancedAlgorithms;

import org.example.N_31_LeetCode.N_3_LongestSubstringWithoutRepeatingCharacters;
import org.junit.Test;
import static org.junit.Assert.*;
public class N_3_LongestSubstringWithoutRepeatingCharactersTests {

    @Test
    public void testLengthOfLongestSubstring() {
        assertEquals(3, N_3_LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, N_3_LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, N_3_LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
        assertEquals(0, N_3_LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(""));
        assertEquals(1, N_3_LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(" "));
        assertEquals(3, N_3_LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("dvdf"));
        assertEquals(3, N_3_LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
    }
}
