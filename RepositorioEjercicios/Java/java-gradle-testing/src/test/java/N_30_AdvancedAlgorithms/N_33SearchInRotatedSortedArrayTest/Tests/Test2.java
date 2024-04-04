package N_30_AdvancedAlgorithms.N_33SearchInRotatedSortedArrayTest.Tests;

import org.example.N_31_LeetCode.N_33SearchInRotatedSortedArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test2 {
    @Test
    public void testSearchInRotatedSortedArray2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int expected = -1;
        int actual = N_33SearchInRotatedSortedArray.search(nums, target);
        assertEquals(expected, actual);
    }
}
