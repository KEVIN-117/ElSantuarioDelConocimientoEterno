package N_30_AdvancedAlgorithms.N_33SearchInRotatedSortedArrayTest.Tests;

import org.example.N_31_LeetCode.N_33SearchInRotatedSortedArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test6 {
    @Test
    public void testSearchInRotatedSortedArray6() {
        int[] nums = {1};
        int target = 0;
        int expected = -1;
        int actual = N_33SearchInRotatedSortedArray.search(nums, target);
        assertEquals(expected, actual);
    }
}
