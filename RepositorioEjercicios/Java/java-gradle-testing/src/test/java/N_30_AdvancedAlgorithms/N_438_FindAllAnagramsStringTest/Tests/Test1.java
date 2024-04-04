package N_30_AdvancedAlgorithms.N_438_FindAllAnagramsStringTest.Tests;

import org.example.N_31_LeetCode.N_438_FindAllAnagramsString;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
public class Test1 {
    @Test
    public void test() {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> result = N_438_FindAllAnagramsString.findAnagrams(s, p);
        List<Integer> expected = List.of(0, 6);
        assertEquals(expected, result);
    }
}
