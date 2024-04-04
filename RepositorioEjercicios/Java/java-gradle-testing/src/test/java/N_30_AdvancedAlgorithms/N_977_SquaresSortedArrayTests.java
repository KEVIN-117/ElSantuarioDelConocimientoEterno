package N_30_AdvancedAlgorithms;

import org.example.N_31_LeetCode.N_977_SquaresSortedArray;
import org.junit.Test;
import static org.junit.Assert.*;
public class N_977_SquaresSortedArrayTests {
    @Test
    public void test1() {
        int[] nums = {-4,-1,0,3,10};
        int[] expected = {0,1,9,16,100};
        int[] actual = N_977_SquaresSortedArray.sortedSquares(nums);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void test2() {
        int[] nums = {-7,-3,2,3,11};
        int[] expected = {4,9,9,49,121};
        int[] actual = N_977_SquaresSortedArray.sortedSquares(nums);
        assertArrayEquals(expected,actual);
    }
}
