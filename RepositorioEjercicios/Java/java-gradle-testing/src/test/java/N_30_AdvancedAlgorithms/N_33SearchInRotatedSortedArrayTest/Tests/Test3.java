package N_30_AdvancedAlgorithms.N_33SearchInRotatedSortedArrayTest.Tests;

import org.example.N_31_LeetCode.N_33SearchInRotatedSortedArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test3 {
    @Test
    public void testSearchInRotatedSortedArray3() {

        int[] nums = {12, 13, 9, 10, 11};
        int target = 10;
        int expected = 3;
        int actual = N_33SearchInRotatedSortedArray.search(nums, target);
        assertEquals(expected, actual);
    }
}
