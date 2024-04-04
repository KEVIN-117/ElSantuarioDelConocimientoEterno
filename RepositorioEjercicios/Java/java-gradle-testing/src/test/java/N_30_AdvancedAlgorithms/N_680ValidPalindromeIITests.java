package N_30_AdvancedAlgorithms;

import org.example.N_31_LeetCode.N_680ValidPalindromeII;
import org.junit.Test;
import static org.junit.Assert.*;
public class N_680ValidPalindromeIITests {
    @Test
    public void test1() {
        assertTrue(N_680ValidPalindromeII.validPalindrome("aba"));
    }
    @Test
    public void test2() {
        assertTrue(N_680ValidPalindromeII.validPalindrome("abca"));
    }
    @Test
    public void test3() {
        assertFalse(N_680ValidPalindromeII.validPalindrome("abc"));
    }
    @Test
    public void test4() {
        assertTrue(N_680ValidPalindromeII.validPalindrome("abaab"));
    }
    @Test
    public void test5() {
        assertFalse(N_680ValidPalindromeII.validPalindrome("abcaa"));
    }
}
