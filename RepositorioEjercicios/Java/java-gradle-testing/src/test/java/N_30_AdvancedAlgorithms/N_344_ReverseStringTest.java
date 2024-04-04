package N_30_AdvancedAlgorithms;
import org.example.N_31_LeetCode.N_344_ReverseString;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
public class N_344_ReverseStringTest {
    @Test
    public void testReverseString(){
        char[] s = {'h','e','l','l','o'};
        char[] expected = {'o','l','l','e','h'};
        char[] actual = N_344_ReverseString.reverseString(s);
        assertArrayEquals(expected, actual);

        char[] in = {'h','e','l','l','o'};
        char[] expected2 = {'o','l','l','e','h'};
        char[] out = N_344_ReverseString.reverseString(in);
        System.out.println(Arrays.toString(out));
        assertArrayEquals(expected2, out);
        System.out.println("====================");

        char[] in2 = {'H','a','n','n','a','h'};
        char[] expected3 = {'h','a','n','n','a','H'};
        char[] out2 = N_344_ReverseString.reverseString(in2);
        System.out.println(Arrays.toString(out2));
        assertArrayEquals(expected3, out2);

        System.out.println("====================");


        char[] in3 = {'a', 'b', 'c', 'd', 'e'};
        char[] expected4 = {'e', 'd', 'c', 'b', 'a'};
        char[] out3 = N_344_ReverseString.reverseString(in3);
        System.out.println(Arrays.toString(out3));
        assertArrayEquals(expected4, out3);

    }
}
