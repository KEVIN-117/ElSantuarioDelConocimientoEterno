package N_30_AdvancedAlgorithms.N_438_FindAllAnagramsStringTest.Tests;

import org.example.N_31_LeetCode.N_438_FindAllAnagramsString;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
public class Test2 {
    @Test
    public void test2() {
        String s = "abab";
        String p = "ab";
        List<Integer> result = N_438_FindAllAnagramsString.findAnagrams(s, p);
        List<Integer> expected = List.of(0, 1, 2);
        assertEquals(expected, result);
    }

}
