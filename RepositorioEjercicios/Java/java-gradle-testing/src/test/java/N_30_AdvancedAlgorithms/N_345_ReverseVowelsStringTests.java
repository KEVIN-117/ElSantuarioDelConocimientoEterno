package N_30_AdvancedAlgorithms;

import org.example.N_31_LeetCode.N_344_ReverseString;
import org.example.N_31_LeetCode.N_345_ReverseVowelsString;
import org.junit.Test;
import static org.junit.Assert.*;
public class N_345_ReverseVowelsStringTests {
    @Test
    public void testReverseVowelsString() {
        assertEquals("oicalupte", N_345_ReverseVowelsString.reverseVowels("eucalipto"));
        assertEquals("holle", N_345_ReverseVowelsString.reverseVowels("hello"));
        assertEquals("kivenAlixes", N_345_ReverseVowelsString.reverseVowels("kevinAlexis"));
        assertEquals("leotcede", N_345_ReverseVowelsString.reverseVowels("leetcode"));
        assertEquals("aullAr", N_345_ReverseVowelsString.reverseVowels("Aullar"));
    }
}
